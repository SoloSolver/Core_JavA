package _11_Exception_HAN;
import java.util.Scanner;
public class _01_try_catch_block {
    public static void main(String[] args) {
        int x,y;
        System.out.println("enter two number :");
        Scanner  sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        try {
            //int a=10,b=2;
            System.out.println("try block executed");
            int c=x/y;
            System.out.println("divition "+c);
        }
        // if the exception is aucer then catch block
        //executed otherwise executes try block
        catch (ArithmeticException e)
        {
            System.out.println("Catch block executed ");
            System.out.println(" try to positive number " +e.getMessage());
        }
        System.out.println("                bye         ");

    }
}
