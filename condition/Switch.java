package condition;
import java.util.*;
public class Switch {
    public static void main(String[] args) {
        //  Taking the input from the user
        Scanner sc = new Scanner(System.in);

        String fruit = sc.next();

        switch (fruit) {
            case "Mango":
            System.out.println("Mango is a juicy fruit");
                
                break;
            case "Apple":
            System.out.println("Apple is a crunchy fruit");
            break;

            case "orange":
            System.out.println("Orange is a sweet fruit");
            break;
            default:
                System.out.println("Enter a valid fruit");
                break;
                
        }
    }
    
}
