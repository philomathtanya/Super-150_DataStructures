import java.util.Scanner;

public class Simple_input_positive_sum {
        public static void main(String args[]) {
            Scanner s=new Scanner(System.in);

            int arr[]=new int[99];
            int sum=0;
            int i=0;

            //int k=5;
            while(true)
            {
                int x=s.nextInt();
                arr[i]=x;
                sum=sum+arr[i];
                if(sum<0)
                {
                    break;
                }
                else
                {
                    System.out.println(arr[i]);
                }
                i++;
                //k--;
            }

        }
    }

