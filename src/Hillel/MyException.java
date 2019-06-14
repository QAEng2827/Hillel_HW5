package Hillel;

public class MyException extends Exception {
    private String exceptionMessage;

    public MyException() {

        exceptionMessage = "No it is impossible action";
        this.exceptionMessage = exceptionMessage;
    }

    public String getExceptionMessage() {
       // exceptionMessage = "No it is impossible action";
        return exceptionMessage;
    }
}

