package JAVA8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Lamda {
    // lambda expressions => Functional interfaces
    /*
     * functional interfaces
     * 1. they can have ONLY ONE ABSTRACT METHOD
     * 2. They can have more than 1 default or static methods => FYI
     * 3. Annotate the interface with @FunctionalInterface
     */
    /*
     * 1. input => parameters
     * 2. output => return
     * 3. body => BL
     */
    public static void main(String[] args) {
        //1.no input no output
        Payment payment=()->System.out.println("Paying by cash");
        payment.pay();
     //2.takes input and not returns output
        Example example=(data,filename)->
        {
            try(
            BufferedWriter writer=new BufferedWriter(new FileWriter(filename)))
            {
              writer.write("Sample text");
                System.out.println("data: "+data+" filename: "+filename);
            }
            catch (IOException e) {
                System.out.println("Exception occured"+e.getMessage());
            }


        };
       example.take("Sample text","test.txt");
       //3 takes input and returns output
        Example2 example2=(a,b)->a+b;

        System.out.println("Addition of a,b : "+example2.add(1,2));
    }

}
