public class TesteTernario2 {
	
	public static void main (String[] args) {
		int a = 2, b = 31, c = 47;
		
		if ( b > c ) {
			a = b;
			
		} else {
			a = c;
		}
		
		//a = b > c ? b : c;
		
		System.out.println ( a );
	}
}

