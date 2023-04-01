public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weighInKg = 98;
        double heightInMeters = 1.87;
        int bmi = service.calculate(weighInKg, heightInMeters);

        System.out.println();
        System.out.println("Ваш индекс массы тела " + bmi);

    }
}
