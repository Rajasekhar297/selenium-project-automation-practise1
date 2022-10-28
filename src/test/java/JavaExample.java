
public class JavaExample {

	public static void main(String[] args) {
		
		String Course = "Java";
		
		char output = 'a';
		
		int variable = Course.length();
		
		int count = 0;
		
		for(int i= 0; i< variable; i++) {
			
			char c = Course.charAt(i);
			
			if(c==output) {
				
				count++;
				
				
			}
		}
		System.out.println("The number of A's are = "+ count);
		
		
		
	}

}
