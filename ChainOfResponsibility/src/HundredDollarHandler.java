public class HundredDollarHandler extends BanknoteHandler {
    public HundredDollarHandler(BanknoteHandler nextHandler) {
        super(nextHandler);
        this.Value = 100;
    }
}
