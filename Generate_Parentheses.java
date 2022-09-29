import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;


public class Generate_Parentheses {
    public static void main(String[] args) {
int n=3;
        List<String> list=new ArrayList<>();
generateParenthesis(n,0,0,"");
    }
    public static void generateParenthesis(int n,int open,int close,String ans) {
        if(open==n && close==n)
        {
            System.out.println(ans);
//            list.add(ans);
//            return;
        }
if(open<n){
    generateParenthesis(n,open+1,close,ans+"(");
}
if(close<open){
    generateParenthesis(n,open,close+1,ans+")");
}
return;
    }
}
