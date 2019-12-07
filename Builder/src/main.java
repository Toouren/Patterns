public class main {
    public static void main(String[] strings) {
        MailMessageBuilder mailMessageBuilder = new MailMessageBuilder();

        MailMessage mailWithBodyAndRecipientMessage = mailMessageBuilder
                .addMessageBody("Привет всем!")
                .addMessageRecipient("nvk.vasiliy@gmail.com")
                .getResult();

        System.out.println(String.format("Письмо только с получателем и телом %n%n%s", mailWithBodyAndRecipientMessage));

        MailMessage mailWithCopyRecipients = mailMessageBuilder
                .addMessageBody("Привет всем")
                .addMessageRecipient("nvk.vasiliy@gmail.com")
                .addMessageCopyRecipients(new String[]{"ivanov@gmail.com", "petrov@gmail.com"})
                .getResult();

        System.out.println(String.format("Письмо с получателем, телом и получателями копии %n%n%s", mailWithCopyRecipients));
    }
}