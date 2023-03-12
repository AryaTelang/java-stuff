import java.util.*;
import aryaa.arya;
public class packprog {
    public static void main(String args[])
    {
        int e;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter energy val ");
        e=sc.nextInt();
        arya obj=new arya();
        System.out.println("o/p is "+(obj.energy(e)));

    }
}
