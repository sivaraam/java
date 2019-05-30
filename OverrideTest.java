class Base {
	protected int method(int val) {
		return val;
	}
}

class Derived extends Base {
// 	protected long method(int val) { return 0; } won't work due to incompatible types (long, int) in return type

//	private int method(int val) { return 0; }  doesn't work due to weaker access previleges

//	public long method(long val) {	return 0; }

	protected int method(int val) { return 0; }

	private int method(long val) {	return 0; }

	protected long method(int val1, int val2) { return 0; }

}
