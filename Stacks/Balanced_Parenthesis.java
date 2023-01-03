import java.util.*;

public class Main {

    public static void main(String[] args) {
        // String next = scanner.next();
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        if (DEMO(next))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static boolean DEMO(String STRING) {
        Stack<Character> STack2 = new Stack<>();
        for (int X = 0; X < STRING.length(); X++) {
            char CHARA = STRING.charAt(X);
            if (CHARA == '(' || CHARA == '{' || CHARA == '[')
                STack2.push(CHARA);
            else {
                if (STack2.isEmpty())
                    return false;
                char t = STack2.peek();
                if (CHARA == '}' && t == '{')
                    STack2.pop();
                else if (CHARA == ']' && t == '[')
                    STack2.pop();
                else if (CHARA == ')' && t == '(')
                    STack2.pop();
                else
                    return false;
            }

        }

        return STack2.size() == 0;

    }

}
