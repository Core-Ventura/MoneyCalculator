package Model;

public class Currency {

    private int code;
    private String symbol;
    private String name;
    
    private Currency() {
        final int code;
        final String symbol;
        final String name;
    }
    
    
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
