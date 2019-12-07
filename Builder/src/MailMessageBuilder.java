public class MailMessageBuilder implements Builder {
    private String messageRecipient;
    private String messageBody;
    private String[] messageCopyRecipients;
    private String messageTheme;

    @Override
    public MailMessageBuilder addMessageRecipient(String recipient) {
        this.messageRecipient = recipient;
        return this;
    }

    @Override
    public MailMessageBuilder addMessageBody(String body) {
        this.messageBody = body;
        return this;
    }

    @Override
    public MailMessageBuilder addMessageCopyRecipients(String[] recipients) {
        this.messageCopyRecipients = recipients;
        return this;
    }

    @Override
    public MailMessageBuilder addMessageTheme(String theme) {
        this.messageTheme = theme;
        return this;
    }

    public MailMessage getResult() {
        return new MailMessage(this.messageRecipient, this.messageBody, this.messageCopyRecipients, this.messageTheme);
    }
}
