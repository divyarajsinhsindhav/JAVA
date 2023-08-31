package Patterns;
public class OneZero{
    public static void main(String[] args) {
        int row = 5;
        int sum;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                sum = i+j;
                if (sum%2==0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}