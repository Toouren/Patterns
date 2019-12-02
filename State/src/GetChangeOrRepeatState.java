public class GetChangeOrRepeatState implements IState {
    public void AddMoney(Context context, int money) throws Exception {
        throw new Exception("Деньги уже положены");
    }

    public void ChoseDevice(Context context, String deviceName) throws Exception {
        throw new Exception("Устройство ввода уже выбрано");
    }

    public void  SelectDocument(Context context, String documentName) {
        context.DocumentName = documentName;
        System.out.println(String.format("Вы выбрали %s", documentName));
        context.State = new PrintState();
    }

    public void Print(Context context) throws Exception {
        throw new Exception("Либо выберите еще документ, либо возьмите сдачу");
    }

    public int GetChange(Context context) {
        System.out.println("Сдача сдана");
        context.State = new EndState();
        return context.Balance;
    }
}
