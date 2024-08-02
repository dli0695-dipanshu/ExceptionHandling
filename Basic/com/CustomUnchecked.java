package Basic.com;

import java.util.Scanner;

class NegativeNumberException extends Exception{
     int number=0;
 NegativeNumberException(String str,int number){
     super(str);
     this.number=number;
 }
  int getNumber(){
     return this.number;
  }
}
public class CustomUnchecked {
     static void negative() throws NegativeNumberException {
         Scanner scanner=new Scanner(System.in);
         int number=scanner.nextInt();
         if(number<0)
             throw new NegativeNumberException("Number should be positive",number);
         else
             System.out.println(number);
     }
    public static void main(String[] args) {
        try {
            negative();
        }catch(NegativeNumberException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }
    }
}
