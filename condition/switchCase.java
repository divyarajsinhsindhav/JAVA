package condition;
import java.util.*;
public class switchCase {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = scn.nextInt();
        switch (number) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            default:
                System.out.println("Enter only 1 or 2.");
                break;
        }
    }
}
