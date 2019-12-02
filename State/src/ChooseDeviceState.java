public class ChooseDeviceState implements IState {
    public void AddMoney(Context context, int money) throws Exception {
        throw new Exception("Деньги уже положены");
    }

    public void ChoseDevice(Context context, String deviceName) {
        context.Device = deviceName;
        System.out.println(String.format("%s был выбран", deviceName));
        context.State = new SelectDocumentState();
    }

    public void  SelectDocument(Context context, String documentName) throws Exception {
        throw new Exception("Сначала выберите устройство ввода");

    }

    public void Print(Context context) throws Exception {
        throw new Exception("Сначала выберите устройство ввода");
    }
}
