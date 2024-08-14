package alpha;

public class recursion {
	
	static int fact(int n) {
		if(n==0) {
			return 0;
				}
		else {
			System.out.println(n);
			return fact(n-1);
			
			
		}
		
	}


public static void main(String[] args)
{
	int a=4;
	
	System.out.print(fact(a));
}
}