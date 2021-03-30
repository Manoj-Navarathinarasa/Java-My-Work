package forthDay;

public class Max {
	public static void main(String args[]) {
		
		int fnum,Snum,Min = 0,Max = 0;
		
		int [] num = {1,3,4,2,0};
		Max=num[0];
		Min=num[0];
		
		for (int i= 1; i<num.length; i++) {
			if (Max<num[i]) {
				Max = num[i];
				//System.out.println("hfgh");
			}
			else if (Min > num[i]) {
				Min = num[i];
			}
			
		}
		System.out.println("Max Numer is : "+Max);
		System.out.println("Min Numer is : "+Min);
	}

}
