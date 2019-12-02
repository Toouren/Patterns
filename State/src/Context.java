public class Context {
    public int Balance;
    public String Device;
    public String DocumentName;
    public IState State;

    public Context()
    {
        State = new InitState();
    }

    public void AddMoney(int money) throws Exception {
        State.AddMoney(this, money);
    }

    public void ChoseDevice(String device) throws Exception {
        State.ChoseDevice(this, device);
    }

    public void SelectDocument(String documentName) throws Exception {
        State.SelectDocument(this, documentName);
    }

    public void Print() throws Exception {
        State.Print(this);
    }
}
