package Basic.com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            Scanner scanner=new Scanner(System.in);
            int first=scanner.nextInt();
            int second=scanner.nextInt();

            int result=first/second;
        }
        catch(ArithmeticException e){
            System.out.println("Second number cant be zero");
        }
        catch(InputMismatchException e){
            System.out.println("Enter integer only");
        }
    }
}
