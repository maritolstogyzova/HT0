package exception;

public class IlluminanceTooMuchException extends Exception {
    public IlluminanceTooMuchException() {}

    public IlluminanceTooMuchException(String e) {
        System.out.println(e);
    }
}
