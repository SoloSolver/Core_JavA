package _11_Exception_HAN;
class  user extends Exception
{
    public String toString()
    {
        return "user defined exception class";
    }

}

public class _06_defind_our_own_exception {
    public static void main(String[] args) {
        try {
            throw new user();
        }
        catch (user e)
        {
            System.out.println(e);
        }
    }
}
