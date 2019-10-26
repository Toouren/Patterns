public class MailMessageBuilder implements Builder {
    private String messageRecipient;
    private String messageBody;
    private String[] messageCopyRecipients;
    private String messageTheme;

    @Override
    public void setMessageRecipient(String recipient) {
        this.messageRecipient = recipient;
    }

    @Override
    public void setMessageBody(String body) {
        this.messageBody = body;
    }

    @Override
    public void setMessageCopyRecipients(String[] recipients) {
        this.messageCopyRecipients = recipients;
    }

    @Override
    public void setMessageTheme(String theme) {
        this.messageTheme = theme;
    }

    public MailMessage getResult() {
        return new MailMessage(this.messageRecipient, this.messageBody, this.messageCopyRecipients, this.messageTheme);
    }
}
