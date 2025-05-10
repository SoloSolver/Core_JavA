package _11_Exception_HAN;
//class excep extends Exception
//{
//    public String toString()
//    {
//        return "user defined exception class";
//    }
//}
public class _09_finaly_block
{
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }
        catch (Exception c)
        {
            System.out.println(c.getMessage());
        }

//        finally block are executed exception are handel or non handle
        finally {
            System.out.println("finaly block executed");
            System.out.println("finish");
        }
    }
}
