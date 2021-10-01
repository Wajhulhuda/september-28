package september28;

import java.util.Scanner;

public class AscendingOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element of the array.");
		int arr[] =new int[5];
		for(int i=0; i<5;i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		sc.close();
		for(int i=0;i<4;i++) {
			if(arr[i]<=arr[i+1]) {
				continue;
			}else {
				count++;
			}
		}
		if(count==0) {
			System.out.println("The array is in ascending order");
			
		}else {
			System.out.println("Not ascending order");
		}		
	}

}
