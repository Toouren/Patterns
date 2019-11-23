public class Banknote {
    CurrencyType Currency;
    int Value;

    public Banknote(int value, CurrencyType currencyType) {
        Currency = currencyType;
        Value = value;
    }
}
