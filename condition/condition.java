package condition;
import java.util.*;
public class condition{
    public static void main(String[] args) {
        //  taking input from the user
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //  finding the largest number

        if (a>b && a>c){
            System.out.println("A is the largest number");

        }
        else if (b>c && b>a) {
            System.out.println("B is the largest number");
            
        }
        else{
            System.out.println("C is the largest");
        }

        sc.close();
    }
}