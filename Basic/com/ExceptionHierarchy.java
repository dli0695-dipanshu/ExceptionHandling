package Basic.com;

import java.util.Scanner;

public class ExceptionHierarchy {
    public static void main(String[] args) {
      try {
          method1();
          method2();
      } catch (ArithmeticException e) {
          System.out.println("Number cant be zero");;
      } catch (NullPointerException e) {
          System.out.println("String Cant be Null");
      }

    }
    static void method1() throws ArithmeticException{
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        if(number==0)
            throw new ArithmeticException("number cant be zero");
    }
    static void method2() throws NullPointerException{
        String str=null;
        throw new NullPointerException("String cant be null");
    }
}
