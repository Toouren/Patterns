import java.util.ArrayList;

public class main {
    public static void main(String[] strings) {

        ChatClient chatClient = new ChatClient();

        BaseChatDecorator hideNamesDecorator = new HideNamesChatDecorator(chatClient);
        BaseChatDecorator encryptionDecorator = new EncryptionChatDecorator(chatClient);

        chatClient.SendMessage(new Message("Bob", "Alice", "Hi, Alice!"));

        ArrayList<Message> hiddenNamesMessages = hideNamesDecorator.GetMessages();
        for(Message message : hiddenNamesMessages){
            System.out.println(message);
        }

        encryptionDecorator.SendMessage(new Message("Alice", "Bob", "Hi, Bob"));
        ArrayList<Message> encryptedMessages = chatClient.GetMessages();
        for(Message message : encryptedMessages){
            System.out.println(message);
        }
        ArrayList<Message> decryptedMessages = encryptionDecorator.GetMessages();
        for(Message message : decryptedMessages){
            System.out.println(message);
        }
    }
}
