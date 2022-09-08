import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arrays_Target_Sum_Pairs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(s.nextInt());
        }
        int tar=s.nextInt();
        Collections.sort(arr);
        for (int i = 0; i < n; i++) {
            for (int j = i; j <n; j++) {
                    if((arr.get(i)+arr.get(j))==tar && (arr.get(i)!=arr.get(j)))
                    {
                        System.out.println(arr.get(i)+" and "+arr.get(j));
                    }
                }
            }
        }

    }
