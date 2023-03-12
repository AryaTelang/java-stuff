import java.util.*;

public class menudrive {
static int res=1;
    static int fact(int num) {
        if (num == 0)
            return 1;
        else {
            return (num * fact(num - 1));
        }

    }
    static int gcd( int x,int y)
    {
        if(y==0)
        {
            return x;
        }
        else
        return gcd(y,x%y);
    }
    static int pow(int n,int m)
    {

        if(m==0)
        return res;
        else
        res=res*n;
        return pow(n,m-1);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n, opt,m;
        

        System.out.println("enter number ");
        opt = sc.nextInt();
        switch (opt) {
            case 1: {
                System.out.println("enter number for fact");
                n = sc.nextInt();

                int res = fact(n);
                System.out.println(" answer is " + res);
                break;
            }
            case 2:
            {
                int num1,num2,lcm,res;
                System.out.println("enter num1 and 2");
                num1=sc.nextInt();
                num2=sc.nextInt();
                res=gcd(num1,num2);
                lcm=(num1*num2)/res;
                
                System.out.println("gcd"+res);
                System.out.println("lcm"+lcm);

            }
            case 3: {
                System.out.println("enter number for x^y");
                n = sc.nextInt();
                
                System.out.println("enter y for x^y");
                m = sc.nextInt();

                pow(n,m);
                System.out.println(" answer is " + res);
                break;
            }
            

        }
    }

}