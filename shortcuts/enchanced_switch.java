package shortcuts;
import java.util.*;
public class enchanced_switch {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the fruit: ");

        String fruit = input.next();
        switch(fruit){
            case "Mango"->System.out.println("King of the fruits");
            case "Apple"-> System.out.println("A sweet red fruit");
            case " Orange"->System.out.println("Round fruit");
            default -> System.out.println("Please enter a valid fruit");

        }
        input.close();
    }
    
}
