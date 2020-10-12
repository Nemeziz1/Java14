public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(84.0, 1.85);
        System.out.println(bmi);
    }
}
