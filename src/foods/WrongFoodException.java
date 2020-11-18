package foods;

public class WrongFoodException extends Exception {
    public WrongFoodException() {}

    public WrongFoodException(String message)
    {
        super(message);
    }
}
