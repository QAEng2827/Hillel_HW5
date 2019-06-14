package Hillel;
/*Create your own exception class using the extends keyword. Write a constructor for this class that takes
a String argument and stores it inside the object with a String reference. Write a method that prints out
the stored String. Create a try-catch clause to exercise your new exception.*/

public class Task1_2 {
    public static void main(String args[]){

        MyException message = new MyException();

        try { throw
                message;
        }catch (MyException e){
            System.out.println(message);
        }
    }

}
