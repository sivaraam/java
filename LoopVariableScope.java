class ArrayVariableScope {
	public static void main(String[] arg) {
//		int x;	affects following declaration in for
		for(int x=0; x<10; x++) {
//			int x;  affects preceding declaration of x in for
			{
//				int x;	!!! ALSO affects preceding declaration in for as it penetrates into inner blocks
			}
		}
		int x;
	}
}
