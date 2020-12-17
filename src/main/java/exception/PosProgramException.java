package exception;

public class PosProgramException extends IllegalArgumentException{
    private static final String PREFIX = "[ERROR] ";
    private static final String NEW_LINE = "\n";

    public PosProgramException(String errorMessage) {
        super(PREFIX + errorMessage + NEW_LINE);
    }

}
