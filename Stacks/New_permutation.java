import java.util.*;
	
	public class Main {
	
	public static void New_Permutation_(String str, int x, String ans) {
	
	if(x==str.length()) {
	
	System.out.print(ans + " ");
	return;
	
	}
	
	char ch = str.charAt(x);
	
	if(ch >= 'a' && ch <= 'z') {
	
	New_Permutation_(str, x+1, ans + ch);
	
	ch = (char) (ch - 32);
	New_Permutation_(str, x+1, ans + ch);
	
	}
	
	else if(ch >= 'A' && ch <= 'Z') {
	
	char smallch = (char)(ch + 32);
	New_Permutation_(str, x+1, ans + smallch);
	New_Permutation_(str, x+1, ans + ch);
	}
	else
	New_Permutation_(str, x+1, ans + ch);
	
	}
	
	public static void main (String args[]) {
	Scanner scan = new Scanner(System.in);
	
	String str = scan.next();
	
	New_Permutation_(str, 0, "");
	
	}
	
	}
