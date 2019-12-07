public interface Builder {
    Builder addMessageRecipient(String recipient);
    Builder addMessageBody(String body);
    Builder addMessageCopyRecipients(String[] recipients);
    Builder addMessageTheme(String theme);
}
