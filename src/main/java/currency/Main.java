package currency;

import currency.parser.ParserGson;
import currency.parser.ParserJackson;

import java.io.IOException;

/**
 * Используя JSON подключиться к НБУ и узнать текущий курс валют (PLN, AED, USD, EURO).
 * @see <a href="https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json">NBU API</a>
 */

public class Main {
    public static void main(String[] args) throws IOException {
        String url = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json";
        System.out.println("GSON");
        ParserGson.parseJson(url);
        System.out.println("Jackson");
        ParserJackson.parseJson(url);
    }
}
