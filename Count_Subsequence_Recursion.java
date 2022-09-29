import java.util.Scanner;

public class Count_Subsequence_Recursion {
   static int count=0;
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.print("Sting : ");
            String str=s.next();
            sub(str,"");
            System.out.println("Count by static variable: "+count);
            System.out.println("Count by recursion: "+Count_Subseq(str,""));
        }
        public static void sub(String ques,String ans){
            if(ques.length()==0)
            {

                System.out.println(ans);
                count++;
                return;
            }
            char ch=ques.charAt(0);
            sub(ques.substring(1),ans);
            sub(ques.substring(1),ans+ch);
        }
    public static int  Count_Subseq(String ques,String ans){
        if(ques.length()==0)
        {

            System.out.println(ans);

            return 1;
        }
        char ch=ques.charAt(0);
        int c1=Count_Subseq(ques.substring(1),ans);
        int c2=Count_Subseq(ques.substring(1),ans+ch);
        return c1+c2;
    }
    }
