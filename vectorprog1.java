import java.util.*;
public class vectorprog1
{
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
    int s,ctr=0,rem;
    Vector v = new Vector ();
      v.add (1);
      v.add (2);
      v.add (2);
      v.add (2);
      v.add (2);
      v.add (3);
      v.add(11);
    System.out.println("enter element to find freq");
    s=sc.nextInt();
    Integer arr[]=new Integer[7];
    v.copyInto(arr);
    for(int i=0;i<7;i++)
    {
        if(s==arr[i])
        ctr++;
    }
    System.out.println(" no "+ctr);

    
    System.out.println("enter element to remove");
    rem=sc.nextInt();
    v.remove((Integer)rem);
    System.out.println(" new "+ v);
  }
}
