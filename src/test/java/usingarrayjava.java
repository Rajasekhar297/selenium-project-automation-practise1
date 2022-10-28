
public class usingarrayjava {
	
	public static void main(String[] args) {
		
		
		String company[] = {"Java", "a", "Raja"};
		
		int variable = company.length;
		
		char output = 'a';
		
		int count = 0;
		
		System.out.println(variable);
		
		
		for(int i = 0 ;i<=variable; i++) {
			
			//char c = company.charAt(i);
			
			
			if(company[i].contains("a")) {
				
				count++;
				
			}
			
			
		}
		System.out.println("The number of A's are :" + count);
		
		
	}

}
