package Array;
import java.util.*;
public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Elements of an Array: ");
		int even= 0;
		int odd =0;
		for(int i =0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
			if(arr[i]%2==0) {
				even +=arr[i];
			}else {
				odd += arr[i];
			}

		}
		System.out.println("Odd numbers sum = "+odd);
		System.out.println("Even numbers sum = "+even);
	}
}
