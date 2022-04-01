public class Symbol {
    public Symbol(String type, String name, String value, Boolean local) {
        this.type = type;
        this.name = name;
        this.value = value;
        this.local = local;
    }

    public Symbol(String type, String name, String value) {
        this.type = type;
        this.name = name;
        this.value = value;
        this.local = true;
    }

    String type;
    String name;
    String value;
    Boolean local;
}
