import java.util.ArrayList;

public class BaseChatDecorator implements IChatClient {
    public IChatClient decoratee;

    public BaseChatDecorator(IChatClient chatClient) {
        this.decoratee = chatClient;
    }

    public void SendMessage(Message message) {
        this.decoratee.SendMessage(message);
    }

    public ArrayList<Message> GetMessages() {
        return this.decoratee.GetMessages();
    }
}
