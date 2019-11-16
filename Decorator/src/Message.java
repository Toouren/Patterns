public class Message {
    public String author;
    public String recipient;
    public String text;

    public Message(String author, String recipient, String text) {
        this.author = author;
        this.recipient = recipient;
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("Author: %s%nRecipient: %s%nText: %s",
                this.author,
                this.recipient,
                this.text);
    }
}
