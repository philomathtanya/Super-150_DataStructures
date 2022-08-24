import java.util.Scanner;

public class Chewbacca_and_Number {

        public static void main(String args[]) {


            Scanner s=new Scanner(System.in);
            long num;
            num=s.nextLong();
            long a[] = new long[20];
            long r;
            int i = 0, j;


            while (num > 0)
            {


                r = num % 10;

                if (9 - r > r)


                    a[i] = r;

                else
                    a[i] = 9 - r;

                i++;


                num = num / 10;
            }


            if (a[i - 1] == 0)
            {
                a[i-1]=9;
            }

            // Print the answer
            for (j = i-1; j >= 0; j--)
                System.out.print(a[j]);
        }
    }

