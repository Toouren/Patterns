public class TenRubleHandler extends BanknoteHandler {
    public TenRubleHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
        this.Value = 10;
    }
}
