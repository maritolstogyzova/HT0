package exception;

public class SpaceUsageTooMuchException extends Exception {
    public SpaceUsageTooMuchException() {}

    public SpaceUsageTooMuchException(String e) {
        System.out.println(e);
    }
}
