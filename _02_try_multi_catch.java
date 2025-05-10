package _11_Exception_HAN;

public class _02_try_multi_catch {
    public static void main(String[] args) {
        int a[] = {10, 3, 0, 6, 5};
        try {
           int r = a[0] / a[2]; // if this will be executed blow code is not executed
            System.out.println("result is " + r);
            System.out.println(a[9]);// if this code is executed uper code is alredy executed
        }
        // with multiple catch bollocks we cannot used parent class in catch because jay exception dikna kano first
        // catch block ey ehandel hoyea jabe
        // multiple catch block
        catch (ArithmeticException e) // atfirst sub clss
        {
            // block 1;
            System.out.println("First Catch block executed ");
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e) // then super class
        {
            // block 2
            System.out.println("Second Catch block executed ");
            System.out.println(e.getMessage());
        }
//        important note if exception is arising then it is handled by corresponding catch block
    }
}
