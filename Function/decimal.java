package Function;
import java.util.*;
import java.lang.Math;
public class decimal{
    public static void decimalBinary(int decimal){
        int binary = 0;
        int rem;
        int counter = 0;
        while (decimal>0) {
            rem = decimal%2;
            binary += (rem * (int)Math.pow(10, counter));
            decimal /= 2;
            counter++;
        }
        System.out.println(binary);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Decimal Number: ");
        int decimal = scn.nextInt();
        System.out.println("Binary:");
        decimalBinary(decimal);
    }
}