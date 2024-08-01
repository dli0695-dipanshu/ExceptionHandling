package Basic.com;

import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            Scanner scanner=new Scanner(System.in);
            int number=scanner.nextInt();
            int result=100/number;
            System.out.println("Result");
        }
        catch (ArithmeticException e){
            System.out.println("Number cant be zero");
        }
        finally {
            System.out.println("division Process executed");
        }
    }
}
