
import java.util.Scanner;


class Functions
{
    public static double[] getDim()
    {
        Scanner scan = new Scanner(System.in);
        double[] dim = new double[2];
        System.out.print("Enter Length: ");
        dim[0] = scan.nextDouble();
        System.out.print("Enter Breadth: ");
        dim[1] = scan.nextDouble();

        return dim;
    }

    public static double Area(double len ,double  brd)
    {
        return len*brd;
    }
}

public class Rectangle 
{
    public static void main(String[] args) {
        double[] dim = Functions.getDim();
        double area = Functions.Area(dim[0],dim[1]);

        System.out.println("Area of Rectangle is: "+area);
    }
}


// Enter Length: 6
// Enter Breadth: 7
// Area of Rectangle is: 42.0