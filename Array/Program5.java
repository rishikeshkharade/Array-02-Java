package Array;
import java.util.*;
public class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the arra Elements :");
		int min = 0;
		for(int i =0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);
//			for(int j=i+1; j<arr.length; j++) {
	//			if(arr)
			}
		
	}
