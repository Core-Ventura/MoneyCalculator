package Application;

import Control.ExchangeCommand;
import Model.CurrencySet;

public class Application {

    public static void main(String[] args) {
        
    CurrencySet currencySet = new CurrencySet();
    ExchangeCommand.execute(currencySet);

    }
    
}
