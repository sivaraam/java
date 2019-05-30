import java.util.Calendar;

class Test {
  public static final Test t = new Test();
  final static int CONST = Calendar.getInstance().get(Calendar.YEAR);
  private final int var;
  private Test() { var = CONST*2; }
  int var() {return var;}
  public static void main(String[] arg) {
    System.out.println(Byte.MIN_VALUE+"\n"+Long.toHexString((byte)Byte.MIN_VALUE));
    System.out.println(Byte.MAX_VALUE+"\n"+Long.toHexString((byte)Byte.MAX_VALUE));
    System.out.println((byte)0x90);
    System.out.println(t.var());
    System.out.println(Calendar.getInstance().get(Calendar.YEAR));
   //void test;        -- illegal start of expression 
  }
}
