class BigDelight {
  public static void main(String[] arg) {
    for(byte b=Byte.MIN_VALUE; b<Byte.MAX_VALUE; b++) 
      if(b == 0x90)
        System.out.println("Joy!");
 
    final byte TARGET = (byte)0x90;
    for(byte b=Byte.MIN_VALUE; b<Byte.MAX_VALUE; b++)
      if(b == TARGET)
         System.out.println("Real Joy!");
  }
}
