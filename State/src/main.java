public class main {
    public static void main(String[] strings) {
        var context = new Context();
        try {
            context.AddMoney(10);
            context.ChoseDevice("wi-fi");
            context.SelectDocument("test_1.doc");
            context.Print();
            context.SelectDocument("test_2.doc");
            context.Print();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
