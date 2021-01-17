import java.util.*;
public class Week9_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of columns: ");
		int c = sc.nextInt();
		int lc = c-2;
		for(int i=1;i<=c;i++) {
			//System.out.print(i);
			for(int j=1;j<=lc;j++) {
				System.out.println(" ");
			}
			lc--;
			for(int k=1;k<=2*(c-i)-1;k++) {
				System.out.print(k);
			}
			System.out.println("");
		}
		lc=1;
			//for(int l = 2;l<=i;l++) {
				//System.out.print(l);
			//}
			//System.out.println();
		//int d= c-1;
		for(int i=1;i<=c-1;i++) {
			for(int j=1;j<=lc;j++) {
				System.out.print(" ");
			}
			lc++;
			for(int k=1;k<=2*(c-i)-1;k++) {
				System.out.print(k);
			}
			System.out.println("");
			
			//for(int l=2;l<=i;l++) {
				//System.out.print(l);
			//}
			//System.out.println();
		}
		
	}

}