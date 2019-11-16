import java.util.ArrayList;

public interface IChatClient {
    void SendMessage(Message message);
    ArrayList<Message> GetMessages();
}
