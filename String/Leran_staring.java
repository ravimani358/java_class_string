package Week1.String;

public class Leran_staring {
	
	public static void main(String[] args) {
		
		//Literal String
		String n1 = "ravi";
		String n2 = "ravi";
		
		System.out.println(n1 == n2); //---> Displaying as True
		
		// Create the string by using the New Keyword
		
		String STR1 = new String("Welcome");
		
		System.out.println(n2 == STR1); //---> Displaying as False Beacuse thay are differnt
		
		System.out.println(STR1.hashCode());
		
	}

}
