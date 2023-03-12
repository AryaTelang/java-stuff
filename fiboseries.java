import javax.lang.model.util.ElementScanner6;

public class fiboseries {
static int a=0,b=1,c;
    static int fibo()
    {
    
    c=a+b;
    a=b;
    b=c;
    return c;
    }
    public static void main(String args[])
    {
        System.out.println("enter how many series");

    }

}
