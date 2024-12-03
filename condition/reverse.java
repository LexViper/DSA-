package condition;
import java.util.*;

public class reverse {
    public static void main(String[] args) {

        //  taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int number = sc.nextInt();

        int reverse=0;

        while(number>0){
            int rem = number%10;
            number/=10;
            reverse = reverse*10+rem;
        }
        System.out.println("The reversed number "+reverse);
    
    }
}