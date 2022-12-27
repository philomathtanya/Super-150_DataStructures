import java.util.*;
public class Main {
   
     public static int mathod(int[] arrayy) {
           Stack<Integer> st = new Stack<>();
        int answer = 0;
        for (int i = 0; i < arrayy.length; i++) {

            while (!st.isEmpty() && arrayy[i] < arrayy[st.peek()]) {

                int r = i;
                int h = arrayy[st.pop()];
                if (st.isEmpty()) {
                    answer = Math.max(answer, h * r);

                } else {
                    int l = st.peek();
                    answer = Math.max(answer, h * (r - l - 1));
                }

            }
            st.push(i);

        }

        int r = arrayy.length;
        while (!st.isEmpty()) {

            int h = arrayy[st.pop()];
            if (st.isEmpty()) {
                answer = Math.max(answer, h * r);

            } else {
                int l = st.peek();
                answer = Math.max(answer, h * (r - l - 1));
            }
        }

        return answer;

    }
     public static void main (String args[]) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(mathod(arr));
    }
}
