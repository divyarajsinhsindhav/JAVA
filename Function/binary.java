package Function;
import java.util.*;
import java.lang.Math;
public class binary{
    public static void binaryDecimal(int binary){
        int decimal = 0;
        int lastDigit;
        int counter = 0;
        while (binary>0) {
            lastDigit = binary%2;
            decimal = decimal + (lastDigit * (int)Math.pow(2, counter));
            binary = binary/10;
            counter++;
        }
        System.out.println("Decimal is " + decimal);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Binary: ");
        int binary = scn.nextInt();
        binaryDecimal(binary);
    }
}