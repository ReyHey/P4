public class Test {
    public static void main(String[] args) throws PutException, GetException {
        SymbolTable ourTable1 = new SymbolTable(null);
        ourTable1.putSymbol("int", "a", "5", true);
        ourTable1.putSymbol("int", "b", "5", true);
        ourTable1.putSymbol("int", "c", "5", true);
        ourTable1.putSymbol("int", "d", "5", true);
        SymbolTable ourTable2 = new SymbolTable(ourTable1);
        ourTable2.putSymbol("int", "e", "5", true);
        ourTable2.putSymbol("int", "f", "5", true);
        ourTable1.putSymbol("int", "g", "5", true);
        ourTable1.putSymbol("int", "h", "5", true);
    }
}