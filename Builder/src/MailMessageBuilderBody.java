public class MailMessageBuilderBody implements BuilderBody {

    private String messageBody;

    MailMessageBuilderBody(String messageBody) {
        this.messageBody = messageBody;
    }

    @Override
    public BuilderWIthBodyAndRecipient addRecipient(String recipient) {
        return new MailMessageBuilderBodyAndRecipient(this.messageBody, recipient);
    }
}
