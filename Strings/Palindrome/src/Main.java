import java.util.*;

public class Main {
	
	public static int half;	
	
	public static boolean checkPalindrome(String str, int half) {
		
		for(int i =0; i < half; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				System.out.println(str.charAt(str.length() - 1));
				return false;
			}
						
		}
	
		return true;
		
	}
	
	public static boolean recursePalindrome(String str) {
		
		int len = str.length();
		
		if (len <= 1) {
			return true;
		}
		
		else if (str.charAt(0) == str.charAt(len-1)) {
			recursePalindrome(str.substring(1, len-1));
			
		}
		
		else if (str.charAt(0) != str.charAt(len-1)) {
			return false;
			
		}
		
		return true;
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a string");
		String str = sc.nextLine();
		half = str.length()/2;
		
		
	//	System.out.println(checkPalindrome(str,half));
		System.out.println(recursePalindrome(str));
	}

}
