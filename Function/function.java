package Function;
import java.util.*;
public class function{
    public static void printHello(){
        System.out.println("Hello World");
    }

    public static int sum(int x, int y){ //Parameters or Formal Parameters
        int sum = x + y;
        return sum;
    }
    /*
     Function Overloading:
     Multiple Functions with the same name but different parameters.
     */
    public static int sum(int x, int y, int z){
        int sum = x+y+z;
        return sum;
    }
    /*
    Function Overloading:
    We can also do function overloading using data type. 
    */
    public static int factorial(int x){
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }
    public static int binomialCoefficient(int n, int r){
        int binomialCoefficient;
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        binomialCoefficient = fact_n/(fact_r*fact_nmr);
        return binomialCoefficient;
    }
    public static void main(String[] args) {
        //printHello();
        Scanner scn = new Scanner(System.in);
        //System.out.println("Enter a & b for sum: ");
        //int a = scn.nextInt();
        //int b = scn.nextInt();
        //System.out.println("Sum: " + sum(a, b)); //Arguments or Actual Parameters
        //System.out.println(sum(1, 2, 3)); //This is example of function overloading.
        System.out.println("Factorial: " + factorial(5));
        System.out.println("Binomial Coefficient: " + binomialCoefficient(5, 2));
    }
}