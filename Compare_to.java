public class Compare_to {
        public static void main(String[] args) {
            String st = "awll";
            String st1 = "hwll";
            System.out.println(camparto(st, st1));
        }

        public static int camparto(String a, String b) {
            int count = 0;
            int i=0;
            int j=0;
            while(i<a.length() && j<b.length())//asdfg,asdfghjkl
            {
                if (a.charAt(i) < b.charAt(i)) {
                    return a.charAt(i) - b.charAt(i);
                }
                else if (a.charAt(i) > b.charAt(i)) {
                    return a.charAt(i) - b.charAt(i);
                }
                i++;
                j++;
            }
            return a.length()-b.length();
        }
    }

