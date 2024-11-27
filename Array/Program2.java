package Array;
import java.util.*;
public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an Array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Elements of an Array: ");
		int count = 0;
		int count1 =0;
		for(int i =0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]%2==0) {
				count++;
		}else {
			count1++;
			}
		}
		System.out.println("Number of Even Elements: "+count);
		System.out.println("Number of Odd Elements: "+count1);
		}
	}
