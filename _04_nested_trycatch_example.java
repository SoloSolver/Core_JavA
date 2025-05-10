package _11_Exception_HAN;

public class _04_nested_trycatch_example {
    public static void main(String[] args) {
        int[] a ={12,0,7,9,5,2};
        try
        {
            int r=a[0]/a[5];
            System.out.println("result is "+r);
            try {
                System.out.println("array element "+a[10]);
            }
            catch (Exception c)
            {
                System.out.println(c.getMessage());
            }
        }
        catch (ArithmeticException c)
        {
            System.out.println(c.getMessage());
        }
        System.out.println("byyy");

    }
}
