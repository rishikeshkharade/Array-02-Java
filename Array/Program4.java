package Array;
import java.util.*;
public class Program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Elements of an Array: ");
		for(int i = 0; i< arr.length; i++) 
			arr[i]= sc.nextInt();
		
		System.out.println("Enter an Element to find in Array: ");
		int x = sc.nextInt();
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i]==x) {
				System.out.println("element found at index "+i);
			}
		}
	}
	
}

