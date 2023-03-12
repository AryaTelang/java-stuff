
public class q1 {
    public static void main(String[] args)
    {
        int num1= Integer.parseInt(args[0]);
        int num2= Integer.parseInt(args[1]);
        int num3= Integer.parseInt(args[2]);
        int arr[]=new int[3];
        arr[0]=num1;
        arr[1]=num2;
        arr[3]=num3;

        for( int i=0;i<3;i++)
        {
            int temp=0;
            for(int j=0;j<2-i;j++)
            {
                if(arr[j+1]>arr[j])
                {
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(" max is "+arr[3]);

    }
}
