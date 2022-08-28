import java.util.Scanner;

public class Double_Sided_Arrow_Pattern_10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int space=n-1;
        int num=1;
        int mspace=-1;
        for (int i = 0; i < n; i++) {
            if(i==0||i==n-1)
            {
                for (int j = 0; j < space; j++) {
                    System.out.print("  ");
                }
                for (int j = num; j >0; j--) {
                    System.out.print(j+" ");
                }
                for (int j = 0; j < space; j++) {
                    System.out.print("  ");
                }
            }
            else {
                for (int j = 0; j < space; j++) {
                    System.out.print("  ");
                }
                for (int j = num; j > 0; j--) {
                    System.out.print(j + " ");
                }
                for (int j = 0; j <mspace; j++) {//Mspase
                    System.out.print("  " );
                }
                for (int j = 1; j <=num; j++) {
                    System.out.print(j+" ");
                }
                for (int j = 0; j < space; j++) {
                    System.out.print("  ");
                }
            }
            System.out.println();
            if(i>=n/2)
            {
                num--;//2
                space+=2;//4
                mspace-=2;//1

            }else
            {
            num++;//2
            space-=2;//4
            mspace+=2;//1
        }}


    }
}
