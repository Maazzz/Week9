import java.util.*;
public class Week9_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element of the arrray: ");
			arr[i]=sc.nextInt();}
		System.out.println("Enter the sum: ");
		int sum = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
					if(arr[i]+arr[j]+arr[k]==sum) {
						System.out.println(arr[i]+","+arr[j]+","+arr[k]+",");
						System.exit(0);
					}}}}}}