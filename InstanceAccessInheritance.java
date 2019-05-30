class Super {
	protected int a;
	Super() {}
	Super(int a) {
		this.a = a;
	}
}

class Sub extends Super {
	Sub() {
		this.a = 5;
	}

	Sub(int a) {
		super(a);
	}
}
