package currency.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import currency.entity.Currency;

import java.io.IOException;
import java.net.URL;

public class ParserJackson {
    public static void parseJson(String url) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Currency[] currencies = objectMapper.readValue(new URL(url), Currency[].class);
        for (Currency currency : currencies) {
            if (currency.getCurrencyAbbr().equals("AED")||
                    currency.getCurrencyAbbr().equals("USD")||
                    currency.getCurrencyAbbr().equals("EUR")||
                    currency.getCurrencyAbbr().equals("PLN"))
                System.out.println(currency);
        }
    }
}
