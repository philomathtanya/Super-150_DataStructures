import java.util.Scanner;

public class Hollow_Diamond_Pattern_9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int star=n+1;//8
        int space=-1;
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {//0,6
                for (int j = 0; j < n ; j++) {
                    System.out.print("*"+"    ");//6
                }
            } else {//1,2,3,4,5
                for (int j = 0; j < star / 2; j++) {
                    System.out.print("*"+"    ");
                }
                for (int j = 0; j < space; j++) {
                    System.out.print("     ");
                }
                for (int j = 0; j < star / 2; j++) {
                    System.out.print("*"+"    ");
                }//8


            }
            System.out.println();

            if(i>=(n/2)){
                star += 2;
                space -= 2;
            }
            else
            {
                star -= 2;
                space += 2;
            }
        }
    }
}
