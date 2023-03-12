
public class methodover {
    float a;

    float area(int x) {
        a = x * x;
        return a;
    }

    float area(int l, int b) {
        a = l * b;
        return a;
    }

    public static void main(String args[])
    {

        methodover obj=new methodover();
        System.out.println("area of square is "+obj.area(10));
        System.out.println("area of rectangle is "+obj.area(12,10));

    }

}
