package Array;
import java.util.*;
public class Program8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an First Array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Elements of array: ");
		for(int i =0; i< arr.length;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter the size of an Second Array: ");
		int m = sc.nextInt();
		int arr1[] = new int[m];
		System.out.println("Enter Elements of array: ");
		for(int i =0; i< arr.length;i++)
			arr1[i]=sc.nextInt();
		
		int flag=0;
		System.out.println("Uncommon elements: ");
		for(int i = 0; i<arr.length; i++) {
			for(int j=0; j<arr1.length; j++) {
				if(arr[i]==arr1[j]) {
					flag =1;
				}
			}
			if(flag==0) {
				System.out.println(arr[i]);
			}
			flag =0;
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr1.length; j++) {
				if(arr1[i]==arr[j]) {
					flag = 1;
				}
			}
		}
	}

}
