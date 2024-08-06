import java.util.Scanner;

public class Gross {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Employee No: ");
        int empno = sc.nextInt();
        
        System.out.print("Enter the Employee Name: ");
        String empname = sc.next();
        
        System.out.print("Enter the basic salary: ");
        double basic = sc.nextDouble();
        
        double da = basic * 0.7;
        double hra = basic * 0.3;
        double cca = 240;
        double pf = basic * 0.1;
        double pt = 100;
        
        double gross = basic + da + hra + cca;
        double net = gross - (pf + pt);
        
        System.out.println("The Employee with No: " + empno + " and name " + empname + " has");
        System.out.println("Gross Salary: " + gross);
        System.out.println("Net Salary: " + net);
    }
}

// Enter the Employee No: 45
// Enter the Employee Name: Nishnat
// Enter the basic salary: 45000
// The Employee with No: 45 and name Nishnat has
// Gross Salary: 90240.0
// Net Salary: 85640.0
