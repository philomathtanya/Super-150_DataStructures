import java.util.Scanner;

public class Coin_Tossed_Outcome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        outcomes(n,"");
    }
    public static void outcomes(int n,String ans){
        if(n==0)
        {
            System.out.println(ans);
            return;
        }
        outcomes(n-1,ans+"H");
        outcomes(n-1,ans+"T");
    }
}
