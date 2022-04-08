import java.util.HashMap;

public class SymbolTable {
    public SymbolTable(SymbolTable parentTable) {
        if (parentTable != null) {
            for (Symbol symbol : parentTable.retrieveAllSymbols().values()) {
                st.put(symbol.name, new Symbol(symbol.type, symbol.name, symbol.value, false));
            }
        }
    }

    public Symbol getSymbol(String name) throws GetException {
        try {
            Symbol symbol = st.get(name);
            if (symbol == null) {
                throw new GetException(name);
            }
            return symbol;
        } catch (GetException ge) {
            throw ge;
        }
    }

    public void putSymbol(String type, String name, String value, Boolean local) throws PutException {
        try {
            Symbol symbol = st.get(name);
            if (symbol != null && symbol.local) {
                throw new PutException(name);
            }
            st.put(name, new Symbol(type, name, value, local));
        }
        catch (PutException pe) {
            throw pe;
        }
    }

    public HashMap<String, Symbol> retrieveAllSymbols() {
        return st;
    }

    private HashMap<String, Symbol> st = new HashMap<String, Symbol>();
}