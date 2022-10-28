
public class largenumber {

	public static void main(String[] args) {
		
		int a[] = new int[] {2,7,5,6,8,10,9};
		
		int count = a.length;//a[0]=2,a[1]=7,a[2]=5,a[3]=6,a[4]=8,a[5]=10,a[6]=9
		 
		int max = a[0];
		
		for(int i=0;i<count;i++) {
			
			if(a[i]>max) {
				
				max=a[i];
				
				
			}
		}
		System.out.println(max);
		
		
	}
	}
		
	
	
	
	

