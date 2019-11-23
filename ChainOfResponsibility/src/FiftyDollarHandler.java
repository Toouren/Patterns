public class FiftyDollarHandler extends BanknoteHandler {
    public FiftyDollarHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
        this.Value = 50;
    }
}
