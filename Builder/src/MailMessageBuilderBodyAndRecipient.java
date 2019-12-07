public class MailMessageBuilderBodyAndRecipient implements BuilderWIthBodyAndRecipient {

    private String messageBody;
    private String recipient;
    private String[] copyRecipients;
    private String theme;

    MailMessageBuilderBodyAndRecipient(String messageBody, String recipient) {
        this.messageBody = messageBody;
        this.recipient = recipient;
    }

    @Override
    public BuilderWIthBodyAndRecipient addCopyRecipients(String[] recipients) {
        this.copyRecipients = recipients;
        return this;
    }

    @Override
    public BuilderWIthBodyAndRecipient addTheme(String theme) {
        this.theme = theme;
        return this;
    }

    @Override
    public MailMessage getMessage() {
        return new MailMessage(this.recipient, this.messageBody, this.copyRecipients, this.theme);
    }
}
