public class CreditPaymentService {
    public double calculate (double credit, double percent, double time) {
        double payment = credit * ((percent / 12 / 100) * (Math.pow((percent / 12 / 100 + 1), time))) / (Math.pow((percent / 12 / 100 + 1), time) - 1);
        return payment;
    }
}
