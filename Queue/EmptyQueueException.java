@SuppressWarnings("serial")
public class EmptyQueueException extends Exception{
    static String message = "The array contains no elements!";
    
    public EmptyQueueException() {
        super(message);
    }
}