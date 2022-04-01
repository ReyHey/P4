public class PutException extends Exception {
    public PutException(String name) {
        super("\"" + name + "\"" + " is already declared in this context.");
    }
}