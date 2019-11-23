public class TenDollarHandler extends BanknoteHandler {
    public TenDollarHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
        this.Value = 100;
    }
}
