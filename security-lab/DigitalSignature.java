import java.security.KeyPairGenerator;
import java.security.KeyPair;
import java.security.Signature;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidKeyException;
import java.security.SignatureException;
import java.util.Base64;
import java.io.UnsupportedEncodingException;

class dss35 {
	public static void main (String... arg) {
		try {

				KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
				KeyPair kp = kpg.genKeyPair();
				Signature sig = Signature.getInstance("MD5withRSA");

				byte[] data  = "test".getBytes("UTF-8");

				sig.initSign(kp.getPrivate());
				sig.update(data);
				byte[] signatureBytes = sig.sign();
				System.out.println("Signature for the literal \"test\":\n"+Base64.getEncoder().encode(signatureBytes));

				sig.initVerify(kp.getPublic());
				sig.update(data);
				System.out.print("\nVerification of the above signature with its public key was " + sig.verify(signatureBytes) ? "\"successful\"" : "\"NOT successful\"");

		} catch (NoSuchAlgorithmException | UnsupportedEncodingException | InvalidKeyException | SignatureException e) {
				e.printStackTrace();
		}
	}
}
