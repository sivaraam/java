class ModTest {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]), d = Integer.parseInt(args[1]);
        System.out.println("a: "+a+" d: "+d);
        System.out.println();
        System.out.printf("%d / %d: %d %n", a, d, a/d);
        System.out.printf("floorDiv(%d, %d): %d %n", a, d, Math.floorDiv(a, d));
        System.out.println();
        System.out.printf("%d %% %d: %d %n", a, d, a%d);
        System.out.printf("floorMod(%d, %d): %d %n", a, d, Math.floorMod(a, d));
    }
}
