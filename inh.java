import java.util.*;

interface sports {
    int sportscore = 100;

    void memberscore();
}

public class inh {
    public static void main(String args[]) {

        int ro, s1, s2;
        Scanner sc = new Scanner(System.in);
        Result r = new Result();
        System.out.println("enter roll");
        ro = sc.nextInt();
        System.out.println("enter sem1");
        s1= sc.nextInt();
        System.out.println("enter sem2");
        s2= sc.nextInt();
        r.input(ro);
        r.marks(s1,s2);
        r.memberscore();
        r.display();            
    }
}

class Student {
    int roll;

    void input(int x) {
        roll = x;
    }

    void dispstud() {
        System.out.println(" Roll No." + roll);
    }
}
C:\Users\Arya\Downloads\flutter_windows_3.3.10-stable.zip\flutter
class Test extends Student {
    int sem1, sem2;

    void marks(int x, int y) {
        sem1 = x;
        sem2 = y;
    }

    void disp() {
        System.out.println("sem1 :" + sem1);
        System.out.println("sem2 :" + sem2);
    }
}

class Result extends Test implements sports {
    float total;

    public void memberscore() {
        total = (sem1 + sem2 + sportscore) / 2;
    }

    void display() {
        disp();
        dispstud();
        System.out.println("total score is " + total);
    }

}