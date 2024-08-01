package Basic.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionChaining {
    static void reader(String filename) throws Exception{
        try {
            BufferedReader br=new BufferedReader(new FileReader(filename));
            br.readLine();
            br.close();
        }catch (IOException ioException){
            throw new IOException("Error file reading: "+filename,ioException);
        }
    }
    public static void main(String[] args) {
        try {
            String filename="sdfghfd/dsghgfd/fg";
            reader(filename);
        }catch (Exception e){
            System.out.println("Exception occur: "+e.getMessage());
            if (e.getCause()!=null){
                System.out.println("cause: "+e.getCause().getMessage());
            }

        } 


    }
}
