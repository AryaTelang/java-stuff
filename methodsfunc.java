import java.util.*;
class methods {
    int c=20,b=10,y;
    
    int computer(int x)
    {
        return x*c*b*y;
    }
    
}
class methodsfunc{
    public static void main(String args[])
    {
        int a;
        methods obj=new methods();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ");
        a=sc.nextInt();

        obj.y=a;
        System.out.println("val is "+obj.computer(5));
        
    }
}
