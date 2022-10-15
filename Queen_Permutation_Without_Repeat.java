public class Queen_Permutation_Without_Repeat {
        public static void main(String[] args) {
            int n=4;
            int tq=2;
            int ind=0;
            boolean [] board=new boolean[n];
            printanswer(board,tq,0,"",0);
        }
        public static void printanswer(boolean[] board , int tq ,int qpsf ,String ans,int ind){
            if(qpsf==tq){
                System.out.println(ans);
                return;
            }
            for (int i = ind; i < board.length; i++) {
                if(board[i]==false){
                    board[i]=true;
                    printanswer(board,tq,qpsf+1,ans+"B"+i+"Q"+qpsf+1,i+1);
                    board[i]=false;
                }
            }
        }
    }

