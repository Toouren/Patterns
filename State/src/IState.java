public interface IState {
    void AddMoney(Context context, int money) throws Exception;
    void ChoseDevice(Context context, String device) throws Exception;
    void SelectDocument(Context context, String documentName) throws Exception;
    void Print(Context context) throws Exception;
}
