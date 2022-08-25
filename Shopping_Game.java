import java.util.Scanner;
public class Shopping_Game {
    public static void main(String args[]) {
            Scanner s=new Scanner(System.in);
            int k=s.nextInt();
            while(k>0)
            {
                int ans=0,h=0,i=1,t=0;
                int m=s.nextInt();
                int n=s.nextInt();

                while(true)
                {
                    int j=i+1;
                    ans+=i;
                    h+=j;

                    if(ans>m)
                    {
                        t=1;
                        break;

                    }
                    if(h>n)
                    {
                        t=0;
                        break;
                    }
                    i+=2;
                    j++;
                }
                k--;

                if(t==1)
                {
                    System.out.println("Harshit");
                }
                else
                {
                    System.out.println("Aayush");
                }
            }
        }
    }
