class HackersDelight {
    public static void main(String[] arg) {
        int x=1729, y=1728;
//        int max = a^((a^b) & -(a<b));
        int max = x - ((x - y) & ((x - y) >> (4 * 8 - 1)));
        System.out.println(max);
    }
}
