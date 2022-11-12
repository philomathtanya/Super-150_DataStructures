import java.util.Scanner;
//incomplete
public class Matrix_Cross_Zeros {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int arr[][]=new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                arr[i][j]=s.nextInt();
            }
        }

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
               if(arr[i][j]==0)
               {
                   for (int k = 0; k <m ; k++) {
                       arr[i][k]=0;
                   }
                   for (int k = 0; k < n; k++) {
                       arr[k][j]=0;
                   }

               }
            }
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
//                arr[i][j]=s.nextInt();
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }

    }
}
