public class Bonus {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1100;
        int newbalance;
        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
            newbalance = balance + refill + bonus;
        }
        else {
            bonus = 0;
            newbalance = balance + refill;
        }
        System.out.println(bonus);
        System.out.println(newbalance);
    }
}
