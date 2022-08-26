import java.util.Scanner;

public class HourGlass_Pattern_16 {
    public static void main(String[] args)
    {Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int num=n;
    int space=4*n-2;
        for (int i = 1; i <= 2*n+1; i++) {
        for (int j = n; j >=num ; j--) {
            System.out.print(j+" ");
        }
        for (int j = 0; j < space; j++) {
            System.out.print(" ");
        }
        for (int j = num; j <=n; j++) {
            if(j!=0)
                System.out.print(j+" ");
        }
        if(i>=n+1) {
            space += 4;
            num++;
        }
        else
        {
            space -= 4;
            num--;
        }
        System.out.println();
    }
}
}