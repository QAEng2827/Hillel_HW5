package Hillel;
/*Create your own resumption-like behavior by using a while loop that repeats until an exception is no longer thrown.*/
public class Task1_4 {

    private static int[] arr = new int[3];
    static int x = 5;
    public static void main(String[] args) {
        while(true) {
            try {
                arr[x] = x;
                System.out.println(arr[x]);
                break;
            } catch(ArrayIndexOutOfBoundsException e) {
                System.err.println(
                        "Caught ArrayIndexOutOfBoundsException");
                e.printStackTrace();
                x--;
            } finally {
                System.out.println("Stop it?");
            }
        }
        System.out.println("Yes");
    }
}
