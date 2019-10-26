public class Director {
    public void constructMessage(Builder builder, String recipient, String body) {
        builder.setMessageRecipient(recipient);
        builder.setMessageBody(body);
    }
    public void constructMessageWithCopyRecipients(Builder builder, String recipient,
                                                   String body, String[] copyRecipients) {
        builder.setMessageRecipient(recipient);
        builder.setMessageBody(body);
        builder.setMessageCopyRecipients(copyRecipients);
    }
    public void constructMessageWithTheme(Builder builder, String recipient,
                                          String body, String theme) {
        builder.setMessageRecipient(recipient);
        builder.setMessageBody(body);
        builder.setMessageTheme(theme);
    }
    public void constructFullMessage(Builder builder, String recipient,
                                     String body, String theme, String[] copyRecipients) {
        builder.setMessageRecipient(recipient);
        builder.setMessageBody(body);
        builder.setMessageTheme(theme);
        builder.setMessageCopyRecipients(copyRecipients);
    }
}
