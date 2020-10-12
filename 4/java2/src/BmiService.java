public class BmiService {
    public double calculate (double mass, double growth) {
        double bmi = mass / (growth * growth);
        return bmi;
    }
}
