public class MailMessageBuilder implements Builder {
    @Override
    public MailMessageBuilderBody addBody(String messageBody) {
        return new MailMessageBuilderBody(messageBody);
    }
}
