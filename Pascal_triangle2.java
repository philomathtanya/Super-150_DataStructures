import java.util.Scanner;

public class Pascal_triangle2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 0;
        int star = 1;
        while (row < n) {
            int i=0;
            int var=1;
            while(i<star)
            {
                System.out.print(var+" ");
                var=(var*(row-i))/(i+1);
                i++;
            }

            System.out.println();
            row++;
            star++;
        }

    }
}