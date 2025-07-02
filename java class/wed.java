import  java.util.Scanner;
public class InputUserCalculator
{
    public void add(int x, int y)
    {
        int valuex = x;
        int valuey = y;
        int z = x+y;
        System.out.println(z);
    }

    public void subtract(int x, int y)
    {
        int valuex = x;
        int valuey = y;
        int z = y-x;
        System.out.println(z);
    }

    public void multiplication(int x, int y)
    {
        int valuex = x;
        int valuey = y;
        int z = x*y;
        System.out.println(z);
    }

    public void division(int x, int y)
    {
        int valuex = x;
        int valuey = y;
        int z = x/y;
        System.out.println(z);
    }
    public static void main(String[]args)
    {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter 1st Value: ");
        int valuex = sc.nextInt();
        System.out.println("Enter 2nd Value: ");
        int valuey = sc.nextInt();
        InputUserCalculator m= new InputUserCalculator();
        m.add(valuex,valuey);
        m.subtract(valuex,valuey);
        m.multiplication(valuex,valuey);
        m.division(valuex,valuey);
    }
}