import java.util.Scanner;

class FCFS {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int arr[]= new int[3];
        int time[]=new int[3];
        int wait[]= new int[3];
        int tat[]=new int[3];
        
        System.out.println("implementing FCFS using Queue ");
        for(int i=0;i<3;i++)
        {
            System.out.println((i+1)+"th element");
            arr[i]=sc.nextInt();
            
            System.out.println("Enter burst time");
            time[i]=sc.nextInt();

            if(i==0)
            {
                tat[i]=time[i];
            }
            else
            tat[i]=time[i]+tat[i-1];
            
            wait[i]=tat[i]-time[i];
        }
        
            System.out.println("Process No.\t Burst Time\t TAT \t Wait Time");
        for(int j=0;j<3;j++)
            {
                
            System.out.println(arr[j]+"\t"+time[j]+"\t"+tat[j]+"\t"+wait[j]);
            
            

        }

    }
}
