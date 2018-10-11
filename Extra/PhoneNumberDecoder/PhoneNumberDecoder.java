import java.util.Scanner;

public class PhoneNumberDecoder{
	final static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args){
		System.out.print("Enter number:");
		String phoneStr = scnr.next();

		for(int i = 0; i < phoneStr.length(); ++i){
			char ch = phoneStr.charAt(i);
			if((ch >= '0' && ch <= '9') || ch == '-') {
				System.out.println("Element " + i + " is: " + ch);
			}
			else if ((ch >= 'A' && ch <= 'C') || (ch >= 'a' && ch <= 'c')) {
				System.out.println("Element " + i + " is: 2");
			}
			else if ((ch >= 'D' && ch <= 'F') || (ch >= 'd' && ch <= 'f')) {
				System.out.println("Element " + i + " is: 2");
			}
			else if ((ch >= 'D' && ch <= 'F') || (ch >= 'd' && ch <= 'f')) {
				System.out.println("Element " + i + " is: 2");
			}else{
				System.out.println("Element " + i + " is ??");
			}
		}
	}
}