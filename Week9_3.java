import java.util.*;
public class Week9_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		if(n>1000) {
			System.out.println("Invalid Number");
			System.exit(0);
		}
		int base=0;
		String roman = "";
		while (n!=0){
			if(n==1000) {
				base = 1000;
				roman = "M";
				//n=n%base;
			}
			if(n>=900&&n<1000) {
				base=900;
				roman = "CM";
				//n=n%base;
			}
			if(n>=500&&n<900) {
				base = 500;
				roman = "D";
				roman = roman.concat(roman);
				//n=n%base;
			}
			if(n>=400&&n<500) {
				base = 400;
				roman = "CD";
				roman = roman.concat(roman);
				//n=n%base;
			}
			if(n>=100&&n<400) {
				base = 100;
				roman = "C";
				roman = roman.concat(roman);
				//n=n%base;
			}
			if(n>=90&&n<100) {
				base = 90;
				roman = "XC";
				roman = roman.concat(roman);
				//n=n%base;
			}
			if(n>=50&&n<90) {
				base = 50;
				roman = "L";
				roman = roman.concat(roman);
				//n=n%base;
			}
			if(n>=40&&n<50) {
				base = 40;
				roman = "XL";
				roman = roman.concat(roman);
				//n=n%base;
			}
			if(n>=10&&n<40) {
				base = 10;
				roman = "X";
				roman = roman.concat(roman);
				//n=n%base;
			}
			if(n==9) {
				base=9;
				roman = "IX";
				roman = roman.concat(roman); 
				//n=n%base;
			}
			if(n==8) {
				base=8;
				roman = "VIII";
				roman = roman.concat(roman);
				n=n%base;
			}
			if(n==7) {
				base=7;
				roman = "VII";
				roman = roman.concat(roman);
				n=n%base;
			}
			if(n==6) {
				base=6;
				roman = "VI";
				roman = roman.concat(roman);
				n=n%base;
			}
			if(n==5) {
				base=5;
				roman = "V";
				roman = roman.concat(roman);
				n=n%base;
			}
			if(n==4) {
				base=4;
				roman = "IV";
				roman = roman.concat(roman);
				n=n%base;
			}
			if(n==3) {
				base=3;
				roman = "III";
				roman = roman.concat(roman);
				n=n%base;
			}
			if(n==2) {
				base=2;
				roman = "II";
				roman = roman.concat(roman);
				n=n%base;
			}
			if(n==1) {
				base=1;
				roman = "I";
				roman = roman.concat(roman);
				n=n%base;
			}
		}
		n=n%base;
		System.out.println(roman);
		//System.out.println(DtoR(n));
	}
	/*public static String DtoR(int n){
		int base=0;
		String roman="";
		while(n!=0) {
			if(n==1000) {
				base = 1000;
				roman = "M";
			}
			else if(n>=900) {
				base = 900;
				roman = "CM"; 
			}
			else if(n>=500) {
				base = 500;
				roman = "D";
			}
			else if(n>=400) {
				base = 400;
				roman = "CD"; 
			}
			else if(n>=100) {
				base = 100;
				roman = "C"; 
			}
			else if(n>=90) {
				base = 90;
				roman = "XC"; 
			}
			else if(n>=50) {
				base = 50;
				roman = "L"; 
			}
			else if(n>=40) {
				base = 40;
				roman = "XL"; 
			}
			else if(n>=10) {
				base = 10;
				roman = "X"; 
			}
			else if(n==9) {
				roman = "IX"; 
			}
			else if(n==8) {
				roman = "VIII"; 
			}
			else if(n==7) {
				roman = "VII"; 
			}
			else if(n==6) {
				roman = "VI"; 
			}
			else if(n==5) {
				roman = "V"; 
			}
			else if(n==4) {
				roman = "IV"; 
			}
			else if(n==3) {
				roman = "III"; 
			}
			else if(n==2) {
				roman = "II"; 
			}
			else if(n==1) {
				roman = "I"; 
			}
			roman = roman.concat(roman);
		}
		return roman;
	}*/
}