import java.util.*;

public class operaters{
    public static void main(String args[]){
        int a;
        int b;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number a & b:");
        a = scn.nextInt();
        b = scn.nextInt();
        int sum = a+b;
        int product = a*b;
        int division = a/b;
        int modulo = a%b;
        int increment = a++;
        int decrement = b--;

        //Binary
        System.out.println("A is "+ a);
        System.out.println("B is "+ b);
        System.out.println("Sum: "+ sum);
        System.out.println("Product: "+ product);
        System.out.println("Division: "+ division);
        System.out.println("Modulo: "+ modulo);

        //Unary
        System.out.println("Increment of a: "+ increment);
        System.out.println("Decrement of b: "+ decrement);
        /* Also we can do post increment and pre increment
         or post decrement and pre decrement. */

        //Comparision
        System.out.println((a!=b)); //is not equal
        /* Also we have is equal, is grater, is less, 
            is less then equal, is greter then equal. */

        //Logical Operaters
        /*In JAVA, we also have logical operaters like,
            AND => &&
            OR => ||
            NOT => !
            etc.
        */

        //Assignment Operaters
        /*In JAVA, we also have assignment operaters.
            For Example:
            a = a + 5;
            this statement we can write like this 'a+=5'.
         */
    }
}