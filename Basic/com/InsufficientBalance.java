package Basic.com;

import java.util.Scanner;

public class InsufficientBalance {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int amount =scanner.nextInt();
        withDraw(amount);
    }
    static void withDraw(int amount) throws ArithmeticException{
        if(amount>1000)
            throw new ArithmeticException("Insufficient Balance");
        else
            System.out.println("WithDrawl Success");
    }
}
