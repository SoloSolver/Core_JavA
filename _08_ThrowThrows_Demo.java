package _11_Exception_HAN;

class NagativeException extends Exception
    // create own class for exception
{
    public String toString()
    {
        return "dimension of rectangle cannot be negative from toString()";
    }

    @Override
    public String getMessage() {
        return "dimension of rectangle cannot be negative from getMessage()";
    }
}



public class _08_ThrowThrows_Demo
{
    static int area(int l,int b)throws NagativeException
    {
        if(l<0||b<0)
        {
            // throw => force fully we wany to passed the exception to calling mehod
            throw new  NagativeException();
        }
        return l*b;
    }
    static void meth1()
    {
        try {
            System.out.println("area is "+area(-10,19));
        }
        catch (NagativeException e)
        {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        meth1();
    }
}
