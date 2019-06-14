package Hillel;
/*Create a class with a main( ) that throws an object of class MyException inside a try block. Give the constructor
for MyException a String argument. Catch the exception inside a catch clause and print the String argument.
Add a finally clause and print a message to prove you were there.*/

public class Task1_1 {

    private String str[]={"one","two","three"};

    public static void main(String[] args) {
     try {
         String str[]={"one","two","three"};
         System.out.println(str[str.length+1]);
         int l = str.length;
     } catch (ArrayIndexOutOfBoundsException e){

        System.out.println("Exeption throw: " + e);
     } finally {

         System.out.println("There isn't such element");
     }


	// write your code here
    }
}
