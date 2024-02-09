package dummy;

public class MyCustomException extends RuntimeException{

    public MyCustomException(String s) {
    super(s);
    }

    public MyCustomException(Throwable cause){
        super(cause);
    }


}
