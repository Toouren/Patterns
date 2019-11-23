public class Bancomat {
    private BanknoteHandler _handler;

    public Boolean Validate(Banknote banknote)
    {
        this.initHandlerChain(banknote);
        return _handler.Validate(banknote);
    }

    private void initHandlerChain(Banknote banknote) {
        switch (banknote.Currency) {
            case Ruble:
                _handler = new TenRubleHandler(null);
                break;
            case Dollar:
                _handler = new TenDollarHandler(null);
                _handler = new FiftyDollarHandler(_handler);
                _handler = new HundredDollarHandler(_handler);
                break;
        }
    }
}
