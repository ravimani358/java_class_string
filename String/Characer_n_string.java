package Week1.String;

public class Characer_n_string {

	public static void main(String[] args) {
		
		String str = "1st values";
		String str1 = "1st Values";
		
		System.out.println(str.length()); //->length()
		
		System.out.println(str.length() -1);// -> find index 
		
		//compare the Two String Values
		
		System.out.println(str.equals(str1)); //--> Fales
		
		// Ignore Case Sensitivity
		
		System.out.println(str.equalsIgnoreCase(str1)); //-> True
		
		// To get the single character from string
		
		System.out.println(str.charAt(2));
		
		// To get the last character in string
				
		System.out.println(str.charAt(str.length()-1)); //--->#@#@# Important once @#@#@#
		
		
	}

}
