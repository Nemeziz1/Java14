public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double payment = service.calculate(1_000_000, 9.99, 12);
        int pay = (int)Math.round(payment);
        System.out.println(pay);

        double payment1 = service.calculate(1_000_000, 9.99, 24);
        int pay1 = (int)Math.round(payment1);
        System.out.println(pay1);

        double payment2 = service.calculate(1_000_000, 9.99, 36);
        int pay2 = (int)Math.round(payment2);
        System.out.println(pay2);
    }
}
