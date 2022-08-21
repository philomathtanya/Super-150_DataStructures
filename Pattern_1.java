public class Pattern_1 {
    public static void main(String[] args) {
        int n=5;
        int top=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < top; j++) {
                System.out.print("*  ");
            }
            System.out.println();
            top++;
        }
    }
}
