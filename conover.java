class A
{
    int a,l,b,area;
A(int a)
{
this.a=a;
area=(this.a*this.a);
}
A(int l,int b)
{
this.l=l;
this.b=b;

area=(this.l*this.b);
}
void disp()
{
System.out.println("area is"+area);
}
}
public class conover {
    public static void main(String args[])
    {
        A obj=new A(10);
        obj.disp();
        A obj2=new A(10,20);
        obj2.disp();
    }
    
}

