import java.util.*;

public class Main {

	public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		
		System.out.println(girlfriend(number));

	}

	public static int girlfriend(int n) {
		
       
        if (n == 1)
            return 0;
        
        if (n == 2)
            return 1;

        return (n - 1) * (girlfriend(n - 1) +girlfriend(n - 2));

	}

}
