package Basic.com;

class InvalidAgeException extends Exception{

    public InvalidAgeException(String str){
        super(str);
    }
}
public class CustomChecked {
    static void validate(int age) throws InvalidAgeException {
        if(age<18)
            throw new InvalidAgeException("Not a valid age");
        else
            System.out.println("Welcome to vote");
    }
    public static void main(String[] args) {
        try {
            validate(17);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
