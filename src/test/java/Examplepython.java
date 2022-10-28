
public class Examplepython {

	public static void main(String[] args) {
		
		
		String course = "Python";
		//String Output = "n";
		
		char Output = 'n';
		
		
		int count = course.length();
		
		System.out.println(count);
		
		for(int i=0;i<=count;i++) {
			 
			
			  char c = course.charAt(i);
			 
			 if(c==Output) {
			 
			//if(course.contains("n")) {
			
			//if(course.equals(Output)) {	

				System.out.println(c);
				
			}
			
		}
	}
}

