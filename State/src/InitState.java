public class InitState implements IState {
    public void AddMoney(Context context, int money)
    {
        context.Balance += money;
        System.out.println(String.format("%d денег положено на счет", money));
        context.State = new ChooseDeviceState();
    }

    public void ChoseDevice(Context context, String deviceName) throws Exception {
        throw new Exception("Сначала положите деньги");
    }

    public void  SelectDocument(Context context, String documentName) throws Exception {
        throw new Exception("Сначала положите деньги");
    }

    public void Print(Context context) throws Exception {
        throw new Exception("Сначала положите деньги");
    }
}
