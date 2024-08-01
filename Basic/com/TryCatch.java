package Basic.com;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            int number=scanner.nextInt();
            int res=100/number;
            System.out.println(res);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("0 is not accepted");
        }
    }
}
