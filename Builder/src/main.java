public class main {
    public static void main(String[] strings) {
        Director director = new Director();

        MailMessageBuilder mailMessageBuilder = new MailMessageBuilder();

        director.constructMessage(mailMessageBuilder,
                "nvk.vasiliy@gmail.com",
                "Привет всем в этом чате");
        System.out.println(String.format("Письмо только с получателем и телом %n%n%s", mailMessageBuilder.getResult()));

        director.constructMessageWithTheme(mailMessageBuilder,
                "nvk.vasiliy@gmail.com",
                "Привет всем в этом чате",
                "Приветствие со всеми");
        System.out.println(String.format("Письмо с получателем, телом и темой %n%n%s", mailMessageBuilder.getResult()));

        director.constructMessageWithCopyRecipients(mailMessageBuilder,
                "nvk.vasiliy@gmail.com",
                "Привет всем в этом чате",
                new String[]{"ivanov@gmail.com", "petrov@gmail.com"});
        System.out.println(String.format("Письмо с получателем, телом и получателями копии %n%n%s", mailMessageBuilder.getResult()));

        director.constructFullMessage(mailMessageBuilder,
                "nvk.vasiliy@gmail.com",
                "Привет всем в этом чате",
                "Приветствие со всеми",
                new String[]{"ivanov@gmail.com", "petrov@gmail.com"});
        System.out.println(String.format("Письмо с получателем, получателями копии, телом и темой %n%n%s", mailMessageBuilder.getResult()));

    }
}
