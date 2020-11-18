package foods;

public class WrongAviarySizeException extends Exception {
    public WrongAviarySizeException() {}

    public WrongAviarySizeException(String message)
    {
        super(message);
    }
}
