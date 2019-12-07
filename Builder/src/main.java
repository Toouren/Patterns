public class main {
    public static void main(String[] strings) {
        MailMessageBuilder mailMessageBuilder = new MailMessageBuilder();

        MailMessage mailWithBodyAndRecipientMessage = mailMessageBuilder
                .addBody("Привет всем!")
                .addRecipient("nvk.vasiliy@gmail.com")
                .getMessage();

        System.out.println(String.format("Письмо только с получателем и телом %n%n%s", mailWithBodyAndRecipientMessage));

        MailMessage mailWithCopyRecipients = mailMessageBuilder
                .addBody("Привет всем")
                .addRecipient("nvk.vasiliy@gmail.com")
                .addCopyRecipients(new String[]{"ivanov@gmail.com", "petrov@gmail.com"})
                .getMessage();

        System.out.println(String.format("Письмо с получателем, телом и получателями копии %n%n%s", mailWithCopyRecipients));
    }
}