import java.util.Scanner;

public class Pascal_Triangle_Pattern_13 {
    public static int fact(int p)
    {
        int fact=1;
        for (int i = 1; i <=p ; i++) {
            fact*=i;
        }
        return fact;
    }
    public int ncr(int n,int r)
    {
        int ncr=fact(n)/(fact(n-r)*fact(r));
        return ncr;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Pascal_Triangle_Pattern_13 obj=new Pascal_Triangle_Pattern_13();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(obj.ncr(i,j)+"    ");
            }
            System.out.println();
        }
    }
}
