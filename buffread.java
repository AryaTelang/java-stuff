import java.io.*;
public class buffread 
{
 public static void main(String args[])throws IOException
 {
    int n;
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);

    try{
    System.out.println("enter a number");
    n=Integer.parseInt(br.readLine());
    }
    catch(NumberFormatException e)
    {
        System.out.println("int format ");

    }
    finally
    {
        System.out.println("stfu");
    }
    

 }   
}
