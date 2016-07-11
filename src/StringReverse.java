import java.util.Scanner;


public class StringReverse {
	public static void main(String[] args) {
		String str, rvStr;
		System.out.println("Please enter the string to be reversed: ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		StringOperations so = new StringOperations();
		System.out.println();
		System.out.println("String Reverse using code");
		rvStr = so.ReverseStr(str);
		System.out.println("The reverse string is: "+ rvStr);
		System.out.println();
		System.out.println("String Reverse using StringBuilder");
		rvStr = so.ReverseStrSB(str);
		System.out.println("The reverse string is: "+ rvStr);
	}

}
