package condition;
import java.util.*;
public class conditionalStatement{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a = scn.nextInt();
        System.out.println("Enter number 2: ");
        int b = scn.nextInt();
        System.out.println("Enter number 3: ");
        int c = scn.nextInt();
        if(a>b && a>c){
            System.out.println("Number a is Largest");
        }
        else if(b>a && b>c){
            System.out.println("Number b is Largest");
        }
        else{
            System.out.println("Number c is Largest");
        }
    }
}
