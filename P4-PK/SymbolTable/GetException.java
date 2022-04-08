public class GetException extends Exception {
    public GetException(String name) {
        super("\"" + name + "\"" + " has not been declared, or is not valid in this context.");
    }
}