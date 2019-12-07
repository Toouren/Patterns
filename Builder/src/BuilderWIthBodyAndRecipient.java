public interface BuilderWIthBodyAndRecipient {
    BuilderWIthBodyAndRecipient addCopyRecipients(String[] recipients);
    BuilderWIthBodyAndRecipient addTheme(String theme);
    MailMessage getMessage();
}
