package Array;
import java.util.*;
public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of an Array :");
		int sum =0;
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			sum += arr[i];
		}
		System.out.println(sum);
		}

}
