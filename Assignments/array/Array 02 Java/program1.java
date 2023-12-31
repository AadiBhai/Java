// Write a program to create an array of 'n' integer elements.
// Where 'n' value should be taken from the user.
// Insert the values from users and find the sum of all elements in the array.

// Input: n = 6
// Enter elements in the array: 2 3 6 9 5 1
// Output: 26

import java.io.*;

class Array {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("n = ");
		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];
		System.out.println("Enter elements in the array: ");
		int sum = 0;

		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}
}
