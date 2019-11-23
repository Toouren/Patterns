abstract class BanknoteHandler{
    private BanknoteHandler _nextHandler;
    int Value;

    protected BanknoteHandler(BanknoteHandler nextHandler)
    {
        _nextHandler = nextHandler;
    }

    public Boolean Validate(Banknote banknote)
    {
        banknote.Value %= this.Value;
        if (banknote.Value == 0) {
            return true;
        } else {
            return _nextHandler != null && _nextHandler.Validate(banknote);
        }
    }
}
