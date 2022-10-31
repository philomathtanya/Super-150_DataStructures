import java.util.*;
class Recursion_Twins {
	  public static int count(String s, int c){
           if(s.length()>=3){
               if(s.charAt(0)==s.charAt(2)) {
                   c++;
               }
                   count(s.substring(2),c);
                   return count(s.substring(1),c);
           }
           return c;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String n=s.next();
        System.out.println(count(n,0));
    }

}
