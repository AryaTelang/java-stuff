import java.util.*;

public class arrobj {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Student obj[]= new Student[3]; 
        for(int i=0;i<3;i++)
        {
            obj[i]=new Student();
            obj[i].input();
        }
        for(int i=0;i<3;i++)
        {
            int temp=0;
            for(int j=0;j<2-i;j++)
            {

                if(obj[j].total>obj[j+1].total)
                {
                    temp=obj[j+1].total;
                    obj[j+1].total=obj[j].total;
                    obj[j].total=temp;

                }
            }
        }
        for(int i=0;i<3;i++)
        {
            obj[i].display();
            System.out.println("");
        }

    }
}

class Student {
    int id, p, c, m,total;
    String name;
    Scanner sc=new Scanner(System.in);

    void input() {
        System.out.println("enter name");
        name = sc.nextLine();
        System.out.println("enter id");
        id = sc.nextInt();
        System.out.println("enter phy");
        p = sc.nextInt();
        System.out.println("enter chem");
        c = sc.nextInt();
        System.out.println("enter math");
        m = sc.nextInt();
        total=p+c+m;

    }

    void display() {

        System.out.print("name\t" + name+"id\t"+id+"total\t"+total);


    }
}