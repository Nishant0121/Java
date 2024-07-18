
import java.util.*;

public class Gross {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the salary: ");
        int salary = sc.nextInt();
        double hra = salary*0.5;
        double da = salary*0.3;
        int ta =2000;
        int pf=200;
        
        double gross = salary+hra+da+ta;
        double net = gross-pf;

        System.out.println("Gross Salary: "+gross);
        System.out.println("Net Salary: "+net);

    }
}
