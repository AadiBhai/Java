// write a program to print the following pattern
// 9  8  7  
// 9  8  7  
// 9  8  7 
//
// USE THIS FOR LOOP STRICTLY
//
// for(int i = 1; i <= 3; i++) {
//	for(int j = 1; j <= 3; j++) {
//
//	}
// } 

class Demo {
	public static void main(String[] args) {
		for(int i = 1; i <= 3; i++) {
			int num = 9;

			for(int j = 1; j <= 3; j++) {
				System.out.print(num + "  ");
				num--;
			}
			System.out.println();
		}
	}
}
