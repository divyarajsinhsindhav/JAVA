package condition;
import java.util.*;
public class conditionalStatement{
    public static void main(String[] args){
        //Largest from 3
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
        /*
        We can also use Ternery operator
        For Example:
        String type = (5%2==0)?"Even":"Odd";
        Here type is var for output Statment 1 & Statment 2
        If condition is true type="Even" else type="Odd" 
        */
    }
}