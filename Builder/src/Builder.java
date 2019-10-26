public interface Builder {
    void setMessageRecipient(String recipient);
    void setMessageBody(String body);
    void setMessageCopyRecipients(String[] recipients);
    void setMessageTheme(String theme);
}
