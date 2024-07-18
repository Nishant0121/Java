import java.util.Scanner;

public class Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String word;
        int i;
        System.out.println("Enter the String: ");
        word = sc.nextLine();
        int len = word.length();
        for(i=0;i<len/2;i++)
        {
            if(word.charAt(i)!=word.charAt(len-i-1))
            {
                System.err.println("The String Is Not Palindeome");
                break;
            }
            else
            {
                System.out.println("The String Is Palindrome");
                break;
            }
        }
    }
}

