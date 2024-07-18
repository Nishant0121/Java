import java.util.*;

public class Arithmatic 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter the two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
