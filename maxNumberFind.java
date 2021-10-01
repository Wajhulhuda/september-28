package september28;

import java.util.Scanner;

public class maxNumberFind {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int arra[] = new int[5];
		int max=Integer.MIN_VALUE;
		System.out.println("Enter the elements of the array");
		for(int i=0; i<5;i++) {
			
			arra[i]= sc.nextInt();
		}
		sc.close();
		for(int i=0; i<5;i++) {
			if(max<arra[i]) {
				max=arra[i];
			}
		}
		System.out.println("The maximum number is "+max);
	}

}
