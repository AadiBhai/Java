// case label must be constant

class Demo {
	public static void main(String[] args) {
		int x = 4;
		switch(x) {
			case 1: System.out.println("one"); break;
			case 2: System.out.println("two"); break;
			case 3: System.out.println("three"); break;
			case 4: System.out.println("four"); break;
			case 5: System.out.println("five"); break;
		};
		System.out.println("After switch");
	}
}
