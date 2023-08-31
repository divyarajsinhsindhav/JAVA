package loop;
public class loop{
    public static void main(String args[]){
        int n = 0;
        System.out.println("This is Example of While loop:");
        while(n<10){ /*If we write 'true' in condition of while loop 
                                    then we can make infinite loop.*/
            System.out.println(n);
            n++;
        }
        System.out.println("This is Example of For loop:");
        for (int i = 0; i < 10; i++) {
            if(i%2==0){
                continue; //Continue is use for skip the iteration.
                        //Break is use for exit the loop.
            }
            System.out.println(i+ "is Odd.");
        }
        System.out.println("This is Example of do_while loop:");
        int number = 0;
        //Condition is statisfied or not loop is still executed minimum 1 time.
        do {
            System.out.println("Do_While loop");
        } while (number != 0);
    }
}