package Hillel;
/*Define an object reference and initialize it to null.
 Try to call a method through this reference.
  Now wrap the code in a try-catch clause to catch the exception.*/

public class Task1_3 {
    private static Integer i = null;
    public static void main(String[] args) {

        try {
            System.out.println(i.toString());
        } catch(NullPointerException e) {
            System.err.println("Caught NullPointerException  "+e.getLocalizedMessage()+ "");

        }
        try {
            i = 10;
            System.out.println(i.toString());
        } catch(NullPointerException e) {
            System.err.println("Caught NullPointerException" );
            e.printStackTrace();

        } finally {
            System.out.println("Got through it");
        }
    }
}
