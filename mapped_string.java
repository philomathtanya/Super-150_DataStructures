import java.util.*;

public class Main {



	public static void method(String input, String oper) {
		
		if (input.length() == 0) {
			
			System.out.println(oper);
			return;
			
		}
		
		String s = input.substring(0, 1);
		
		int n = Integer.parseInt(s);
		
		method(input.substring(1), oper + (char) (64 + n));
		
		if (input.length() >= 2) {
			
			s = input.substring(0, 2);
			
			n = Integer.parseInt(s);
			
			if (n <= 26)
				method(input.substring(2), oper + (char) (64 + n));
			
		}
		
	}
		public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		String sttr = s.next();
		
        method(sttr, "");
        
	}

}
