import java.util.Scanner;

public class Rat_Chases_Cheese {
    static boolean mark=false;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        char arr[][] = new char[n][m];
        for (int i = 0; i < n; i++) {
            String str = s.next();
            for (int j = 0; j < m; j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        int ans[][]=new int[n][m];
        hasPath(arr,0,0,ans);
        if(mark==false){
            System.out.println("NO PATH FOUND");
        }
    }
        public static void hasPath(char maze[][],int cc,int cr,int ans[][])
        {
            if(cr==maze.length-1 && cc==maze[0].length-1 && maze[cr][cc]!='X')
            {
             ans[cr][cc]=1 ;
             display(ans);
             mark=true;
                return;
            }
            if(cr<0 || cc<0 ||cr>= maze.length ||cc>=maze[0].length || maze[cr][cc]=='X'){
                return;
            }
            maze[cr][cc]='X';
            ans[cr][cc]=1;
            hasPath(maze,cc,cr-1,ans);//up
            hasPath(maze,cc,cr+1,ans);//down
            hasPath(maze,cc-1,cr,ans);//left
            hasPath(maze,cc+1,cr,ans);//right
            maze[cr][cc]='O';
            ans[cr][cc]=0;
        }
        public static void display(int arr[][]){
            for (int i = 0; i < arr.length ; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }

}
