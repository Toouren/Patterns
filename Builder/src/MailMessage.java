public class MailMessage {
    private String messageRecipient;
    private String messageBody;
    private String[] messageCopyRecipients;
    private String messageTheme;

    public MailMessage(String messageRecipient, String messageBody,
                       String[] messageCopyRecipients, String messageTheme) {
        this.messageRecipient = messageRecipient;
        this.messageBody = messageBody;
        this.messageCopyRecipients = messageCopyRecipients;
        this.messageTheme = messageTheme;
    }

    public String toString() {
        String resultMailMessage = new String();
        if (this.messageTheme != null) {
            resultMailMessage = resultMailMessage.concat(String.format("Тема: %s;%n", this.messageTheme));
        }
        resultMailMessage = resultMailMessage.concat(String.format("Получатель: %s;%n", this.messageRecipient));
        if (this.messageCopyRecipients != null) {
            String messageCopyRecipientsString = String.join(", ", this.messageCopyRecipients);
            resultMailMessage = resultMailMessage.concat(String.format("Получатели копии: %s;%n", messageCopyRecipientsString));
        }
        resultMailMessage = resultMailMessage.concat(String.format("Сообщение: %s%n", this.messageBody));
        return  resultMailMessage;
    }
}
