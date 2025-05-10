package _11_Exception_HAN;

public class _03_nested_try_catch {
    public static void main(String[] args) {
        int a[]={12,0,7,8};
        try // first try block
        {

                try // nested tri block
                {
                    int r=a[0]/a[1];
                    System.out.println(r);
                }
                catch (RuntimeException e) // this catch block containt any exception
                {
                    System.out.println(e);
                }

                System.out.println(a[10]);
        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
//
//  try
//        {
//
//        }
//  catch()
//        {
//
//        }
//  catch ()
//        {
//
//        }
//  catch()
//        {
//
//        }
//
//  finally() finally block is optional
//        { // **** finally block definitely get executed
//
        // it not depends try block executed or catch block executed
//        }
