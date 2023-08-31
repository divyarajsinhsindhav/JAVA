package loop;
import java.util.*;
public class prime{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scn.nextInt();
        int flag = 1;
        if (number==0 || number==1) {
            System.out.println("Number is non Prime.");
        } else {
            for (int i = 2; i < number/2; i++) {
                if(number%i==0){
                    flag=0;
                }
            }
            if (flag==0) {
                System.out.println("Number is non prime number.");
            } else {
                System.out.println("Number is prime number.");
            }
        }
    }
}