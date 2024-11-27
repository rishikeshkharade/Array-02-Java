package Array;
import java.util.*;
public class Program6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array: ");
		int m = sc.nextInt();
		int arr[] = new int[m];
		
		int max = 0;
		System.out.println("Enter the Elements :");
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("max element :"+max);
	}

}
