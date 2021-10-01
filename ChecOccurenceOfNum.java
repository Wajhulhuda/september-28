package september28;
import java.util.Scanner;

public class ChecOccurenceOfNum {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter the elements of arr..");
		for(int i=0;i<5;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("Enter the desired number..");
		int num= sc.nextInt();
		for(int i=0;i<5;i++) {
			if(num==arr[i]){
			System.out.println("Number is present");
			break;
			}
			
		}
		System.out.println("Number is not present");
	}

}
