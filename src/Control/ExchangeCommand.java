package Control;

import Model.CurrencySet;
import Model.Exchange;
import Model.ExchangeRate;
import View.ExchangeDialog;
import View.ExchangeRateLoader;
import View.MoneyDisplay;

public class ExchangeCommand {

    public ExchangeCommand(){
        CurrencySet currencySet;
    }
    
    public static void execute(CurrencySet currencySet){
        readExchangeDialog(currencySet);
        readExchangeRateLoader();
        readExchange();
        readMoneyDisplay();
    }
    
    private static ExchangeRate readExchangeDialog(CurrencySet currencySet){
        return ExchangeDialog.execute(currencySet);   
    }
    
    private static ExchangeRateLoader readExchangeRateLoader(){
        return null;   
    }
    
    private static Exchange readExchange(){
        return null;   
    }
    
    private static MoneyDisplay readMoneyDisplay(){
        return null;   
    };
    
    
    
    
    
    
    
}
