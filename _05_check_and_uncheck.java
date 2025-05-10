package _11_Exception_HAN;
import java.io.*;
class low extends Exception
{
    @Override
    public String toString()
    {
        return "balacne is should not less then 5000";
    }
}

public class _05_check_and_uncheck
{
    static void fun1()
    {
            try {
                throw new low();
            }
            catch (low e)
            {
                System.out.println(e);
            }

    }
    static void fun2()
    {
        fun1();
    }
    static void fun3()
    {
        fun2();
    }

    public static void main(String[] args) {
        fun3();
    }
}
