// Write a program to find a maximum between three numbers
// Input1: num1 = 1; num2 = 2; num3 = 3;
// Output1: 3 is the maximum between 1, 2 and 3
// Input2: num1 = 1; num2 = 4; num3 = 3;
// Output2: 4 is the maximum between 1, 4 and 3
// Input3: num1 = 42; num2 = 32; num3 = 42;
// Output3: ????

class Demo{
	public static void main(String[] args){
		int num1 = 42;
		int num2 = 32;
		int num3 = 42;

		if((num1 >= num2) && (num1 >= num3)){
			System.out.println(num1 + " is the maximum between " + num1 + ", " + num2 + " and " + num3);
		} else if((num2 >= num1) && (num2 >= num3)){
			System.out.println(num2 + " is the maximum between " + num1 + ", " + num2 + " and " + num3);
		} else if((num3 >= num2) && (num3 >= num1)){
			System.out.println(num3 + " is the maximum between " + num1 + ", " + num2 + " and " + num3);
		}
	}
}
