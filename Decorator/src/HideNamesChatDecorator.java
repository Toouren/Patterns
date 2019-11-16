import java.util.ArrayList;

public class HideNamesChatDecorator extends BaseChatDecorator {

    public HideNamesChatDecorator(IChatClient chatClient) {
        super(chatClient);
    }

    @Override
    public ArrayList<Message> GetMessages() {
        ArrayList<Message> messages = super.GetMessages();
        for (Message message : messages) {
            message.author = message.author.replaceAll(".", "*");
            message.recipient = message.recipient.replaceAll(".", "*");
        }
        return messages;
    }
}
