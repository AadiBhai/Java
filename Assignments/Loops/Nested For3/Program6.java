// Write a program to print the following pattern

// 9    
// 9    8    
// 9    8    7    
// 9    8    7    6    

// USE THIS FOR LOOP STRICTLY for the outer loop
// for(int i = 1; i <= 4; i++){
//
// }

class Demo {
	public static void main(String[] args) {
		for(int i = 1; i <= 4; i++){
			int num = 9;
			for(int j = 1; j <= i; j++){
				System.out.print(num-- + "    ");
			}
			System.out.println();
		}
	}
}
