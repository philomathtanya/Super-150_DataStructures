import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
    int n;
    Scanner s=new Scanner(System.in);
        System.out.println("Enter the marks: ");
    n=s.nextInt();
    if(n>=75)
    {
        System.out.println("A");
    }
    else if(n<75 && n>=65)
    {
        System.out.println("B");
    }
    else if(n<65 && n>=55)
    {
        System.out.println("C");
    }
    else if(n<55 && n>=45)
    {
        System.out.println("D");
    }
    else
        System.out.println("fail");
    }
}
