public class main {
    public static void main(String[] strings) {
        Bancomat bancomat = new Bancomat();
        System.out.println(bancomat.Validate(new Banknote(1500, CurrencyType.Dollar)));
    }
}
