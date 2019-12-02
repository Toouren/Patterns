public class SelectDocumentState implements IState {
    public void AddMoney(Context context, int money) throws Exception {
        throw new Exception("Деньги уже положены");
    }

    public void ChoseDevice(Context context, String deviceName) throws Exception {
        throw new Exception("Устройство ввода уже выбрано");
    }

    public void  SelectDocument(Context context, String documentName) throws Exception {
        context.DocumentName = documentName;
        System.out.println(String.format("Вы выбрали %s", documentName));
        context.State = new PrintState();
    }

    public void Print(Context context) throws Exception {
        throw new Exception("Сначала выберите документ");
    }
}
