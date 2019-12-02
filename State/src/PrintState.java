public class PrintState implements IState {
    public void AddMoney(Context context, int money) throws Exception {
        throw new Exception("Деньги уже положены");
    }

    public void ChoseDevice(Context context, String deviceName) throws Exception {
        throw new Exception("Устройство ввода уже выбрано");
    }

    public void  SelectDocument(Context context, String documentName) throws Exception {
        throw new Exception("Документ уже выбран");
    }

    public void Print(Context context) {
        if (context.Balance > 5)
        {
            System.out.println(String.format("Документ %s напечатан", context.DocumentName));
            context.Balance -= 3;
            context.State = new GetChangeOrRepeatState();

            return;
        }

        System.out.println("Недостаточно средств");
        context.State = new EndState();
    }
}
