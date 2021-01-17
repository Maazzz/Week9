import java.util.*;
public class Week9_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st string:");
		String s1 = sc.nextLine();
		s1 = s1.toLowerCase();
		System.out.println("Enter 2nd string:");
		String s2 = sc.nextLine();
		s2= s2.toLowerCase();
		for(int i=0;i<s1.length();i++) {
			char ch = s1.charAt(i);
			for(int j=0;j<s2.length();j++) {
				char ch1 = s2.charAt(j);
				System.out.println(ch1);
				if(ch1==ch) {
					s1 = s1.substring(0,s1.indexOf(ch1)).concat(s1.substring(s1.indexOf(ch1)+1));
				}}}
		System.out.println(s1);
	}}