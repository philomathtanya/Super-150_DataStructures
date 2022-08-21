public class Pattern_2 {
    public static void main(String[] args) {
        int n=5;
        int top=n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < top; j++) {
                System.out.print("*  ");
            }
            System.out.println();
            top--;
        }
    }
}
