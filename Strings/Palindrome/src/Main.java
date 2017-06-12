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
	
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a string");
		String str = sc.nextLine();
		half = str.length()/2;
		
		
		System.out.println(checkPalindrome(str,half));
	}

}
