import java.util.Scanner;
public class SubSequence_Recursion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Sting : ");
        String str=s.next();
        sub(str,"");
    }
    public static void sub(String ques,String ans){
        if(ques.length()==0)
        {

            System.out.println(ans);
            return;
        }
       char ch=ques.charAt(0);
       sub(ques.substring(1),ans);
       sub(ques.substring(1),ans+ch);
    }
}