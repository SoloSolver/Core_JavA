package _11_Exception_HAN;

public class _07_throw_keyword {
    public static void main(String[] args)
    {
        _07_throw_keyword ob=new _07_throw_keyword();
      // if called method return exception hear try and catch block is not
        // avalable then program is crash because it return exception to jvm(java vertual mathin)
       ob.method_1();
    }
    void method_1()
    {
        // if called method return exception heat must be try and catch block
        // other wise it also pass the exeption in calling method main()
        try {
            int a =area(7,7); // call the are() method
            System.out.println(a);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


    }
    int area(int x,int y)throws Exception // by using throws caller is responsible to handel the exception
    {
        // exception oucer then pas the exception the calling method
// method_2()
        if(x<0||y<0)
        {
            // throw the exception then after method signature
            // must be wright throws Exception
            throw new Exception("length amd brath can not be negative");
        }
        return x*y;
    }
}
