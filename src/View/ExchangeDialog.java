package View;

import Model.CurrencySet;
import Model.ExchangeRate;
import java.util.Scanner;

public class ExchangeDialog {

    public ExchangeRate exchangeRate;
    
    public ExchangeDialog(CurrencySet currencySet) {
        ExchangeRate exchangeRate = execute(currencySet);
    }
    
    public static ExchangeRate execute(CurrencySet currencySet){
        System.out.println("Select currency: (€,$)");
        System.out.println("Select currency (to) (1):");
        String currencyTo = "";
        Scanner inputScanner = new Scanner (System.in);
        currencyTo = inputScanner.nextLine ();
        return null;
        
    };

}
