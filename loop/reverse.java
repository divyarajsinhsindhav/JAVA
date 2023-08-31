package loop;
import java.util.*;
public class reverse{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n;
        int remainder;
        int reverse = 0;
        System.out.println("Enter Number: ");
        n = scn.nextInt();
        while(n!=0){
            remainder = n%10;
            n = n/10;
            reverse = reverse*10 + remainder;
        }
        System.out.println("Reverse is: " +reverse);
    }
}