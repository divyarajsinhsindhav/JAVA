import java.util.*;

public class calc{
    public static void main(String args[]){
        int a;
        int b;
        int d;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number a & b:");
        a = scn.nextInt();
        b = scn.nextInt();
        d = scn.nextInt();
        int sum = a+b;
        int product = a*b;
        float area = 3.14f*d;
        System.out.println("Sum of a & b, Product of a & b, Area of D diameter Circle");
        System.out.println(sum);
        System.out.println(product);
        System.out.println(area);
    }
}