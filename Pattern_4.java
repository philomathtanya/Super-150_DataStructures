public class Pattern_4 {
    public static void main(String[] args) {
        int n=5;
        int space=0;
        int star=n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
            space++;
            star--;
        }
    }
}
