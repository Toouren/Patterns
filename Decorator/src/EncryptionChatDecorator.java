import java.util.ArrayList;

public class EncryptionChatDecorator extends BaseChatDecorator {

    public EncryptionChatDecorator(IChatClient chatClient) {
        super(chatClient);
    }

    private static String encryptionTag = "<encrypted>";

    @Override
    public void SendMessage(Message message) {
        message.text = encryptionTag + message.text + encryptionTag;
        super.SendMessage(message);
    }

    @Override
    public ArrayList<Message> GetMessages() {
        ArrayList<Message> messages = super.GetMessages();
        for (Message message : messages) {
            if (message.text.startsWith(encryptionTag)) {
                message.text = message.text.substring(encryptionTag.length(), message.text.length() - encryptionTag.length());
            }
        }
        return  messages;
    }
}
