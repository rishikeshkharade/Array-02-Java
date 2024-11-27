package Array;
import java.util.*;
public class Program7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); {
			System.out.println("Enter the size of an First array: ");
			int n = sc.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter the elements of First array: ");
			for(int i = 0; i< arr.length; i++)
				arr[i]=sc.nextInt(); 
			System.out.println("Enter the size of an Second Array: ");
			int m = sc.nextInt();
			int arr1[] = new int[m];	
			System.out.println("Enter Elements of Second array :");
			for(int i =0; i< arr1.length; i++) {
				arr1[i]=sc.nextInt();
			}
			System.out.println("Common Elements of an array: ");

			for(int i = 0; i<arr.length; i++) {
				for(int j = 0; j< arr1.length; j++) {
					if(arr[i]==arr1[j]) {
						System.out.println(arr[i]);
						break;
					}
				}
			}
		}
	}
}

