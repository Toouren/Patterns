import java.util.ArrayList;

public class ChatClient implements IChatClient {

    private ArrayList<Message> messageList = new ArrayList<Message>();

    public void SendMessage(Message message) {
        this.messageList.add(message);
        System.out.println("Message sended");
    }

    public ArrayList<Message> GetMessages() {
        return this.messageList;
    }
}
