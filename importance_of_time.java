import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int var = s.nextInt();
		
		int[] t1 = new int[var];
		
		int[] fii = new int[var];
		
		for (int i = 0; i < t1.length; i++)
			t1[i] = s.nextInt();
		
		for (int j = 0; j < fii.length; j++)
			fii[j] = s.nextInt();
		
		System.out.println(method(t1, fii));

	}

	public static int method(int[] c, int[] ii) {
		
		int t = 0;
		
		Queue<Integer> s1 = new LinkedList<>();
		
		Queue<Integer> s2 = new LinkedList<>();
		
		for (int i = 0; i < c.length; i++)
			s1.add(c[i]);
		
		for (int j = 0; j < ii.length; j++)
			s2.add(ii[j]);
		
		while (!s1.isEmpty()) {
		    
			if (s1.peek() == s2.peek()) {
				
				t++;
				
				s1.poll();
				
				s2.poll();
				
			}
			else {
				
				int i = s1.poll();
				
				s1.add(i);
				
				t++;
				
			}

		}
		return t;
	}

}
