package Function;
public class primeInRange {
    public static boolean prime(int x){
        for (int i = 2; i <= x/2; i++) {
            if (x%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void primeRange(int range){
        System.out.println("Prime in Range is ");
        for (int i = 2; i <= range; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        primeRange(20);
    }
}