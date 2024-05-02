package lab_7;

public class CompareStringToChar {

	public static void main(String[] args) {

		String str1 = "Color of Mango is Yellow.";
		String str2 = "Color of Banana is Yellow.";
		CharSequence cs = "Color of Mango is Yellow.";
		
		System.out.println("Compare String to CharSequence1: " +str1.equals(cs));
		System.out.println("Compare String to CharSequence2: " +str2.equals(cs));
		
	}

}
