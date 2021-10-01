package september28;

import java.util.Scanner;

public class MinByInput {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of the array");
		int arra[] = new int[5];
		int min = Integer.MAX_VALUE;
		for(int i=0; i<5;i++) {
			arra[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0;i<5; i++) {
			if(min>arra[i]) {
				min = arra[i];
			}
			
		}
		System.out.println("The minimum number of this array is "+ min);
	}

}
