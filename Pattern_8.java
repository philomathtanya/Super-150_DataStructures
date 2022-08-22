public class Pattern_8 {
    public static void main(String[] args) {
        int n=5;
        int top=1;
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < top; j++) {
                System.out.print("*  ");
            }
            System.out.println();
            // Mirroring
            if(i<n-1)
            top++;
            else
                top--;
        }
    }
}
