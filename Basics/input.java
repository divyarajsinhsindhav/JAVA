import java.util.*;

public class input{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        
        //String name = scn.next();
        /*This function capture use for input of Word*/
        //System.out.println(name);
        
        System.out.print("Enter name:");
        String avenger = scn.nextLine();//For Input sentences, paragraph etc.
        System.out.println(avenger);

        System.out.println("Enter integer number");
        int number = scn.nextInt();//For Input integer number
        System.out.println(number);

        System.out.println("Enter float number");
        float floatNumber = scn.nextFloat();//For input float number
        System.out.println(floatNumber);
    }
}