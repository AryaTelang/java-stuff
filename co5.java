import java.util.*;

public class co5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        System.out.println("enter 1");
        s1 = sc.nextLine();
        System.out.println("enter 2");
        s2 = sc.nextLine();
        int l = s1.length();
        int ctr = 0, flag = 0;
        Integer arr[] = new Integer[3];

        if (s1.length() == s2.length()) {
            for (int i = 0; i < l; i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    ctr++;
                    arr[ctr] = i;
                }
            }
            if (ctr > 2) {
                System.out.println("false"+ctr);
            } 
            else {
                char ch = s1.charAt(arr[1]);
                s1.replace(s1.charAt(arr[1]), s1.charAt(arr[2]));
                
                s1.replace(s1.charAt(arr[2]), ch);
                System.out.println(""+s1.equals(s2));
                System.out.println(""+s1);
                System.out.println(""+arr[1]);
                System.out.println(""+arr[2]);

                if (s1.equals(s2))
                 {
                    System.out.println("meta strings");
                }

                else
                    
                    System.out.println("false2");
            }

        } 
        else {
            System.out.println("false3");
        }

    }
}
