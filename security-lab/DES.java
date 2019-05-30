import java.math.BigInteger;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.Cipher;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidKeyException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.BadPaddingException;

class DES {
		public static void main(String... arg) {
				try {
						KeyGenerator des_kg = KeyGenerator.getInstance("DES");  
                        SecretKey sk = des_kg.generateKey();
                        Cipher des_cipher = Cipher.getInstance("DES/ECB/PKCS5PADDING");

                        // Encryption
                        des_cipher.init(Cipher.ENCRYPT_MODE, sk);
                        byte[] plain_text =  arg[0].getBytes();
                        byte[] enc_text = des_cipher.doFinal(plain_text);
                        System.out.println("Encrypted text: "+enc_text);

                        // Decryption
                        des_cipher.init(Cipher.DECRYPT_MODE, sk);
                        byte[] dec_text = des_cipher.doFinal(enc_text);
                        System.out.println("Decrypted text: "+ new String(dec_text));

				} catch (NoSuchAlgorithmException | InvalidKeyException | IllegalBlockSizeException | NoSuchPaddingException | BadPaddingException e) {
                    e.printStackTrace();
                }
		}
}
