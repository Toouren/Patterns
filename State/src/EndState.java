public class EndState implements IState {
    public void AddMoney(Context context, int money) throws Exception {
        throw new Exception("Выполнение окончено");
    }

    public void ChoseDevice(Context context, String deviceName) throws Exception {
        throw new Exception("Выполнение окончено");
    }

    public void  SelectDocument(Context context, String documentName) throws Exception {
        throw new Exception("Выполнение окончено");

    }

    public void Print(Context context) throws Exception {
        throw new Exception("Выполнение окончено");
    }
}
