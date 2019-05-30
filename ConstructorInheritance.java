class Atom {
	Atom() { System.out.print("atom "); }
}

class Rock extends Atom {
	Rock(String type) { System.out.print(type); }
}

class Mountain extends Rock {
	Mountain(String s) {
		super("granite ");	//removing this wouldn't compile
		new Rock(s);
	}
	public static void main(String[] a) { 
		new Mountain("granite");
	}
}
