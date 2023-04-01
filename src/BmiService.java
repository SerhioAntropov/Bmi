public class BmiService {
    public int calculate (double weighInKg, double heightInMeters){
        double bmi = weighInKg / (heightInMeters * heightInMeters);
        return (int) bmi;

    }
}
