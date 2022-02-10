public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 42; // кг
        int height = 158; // см
        double bodyMassIndex = service.calculate(weight, height);

        System.out.println("Индекс массы тела равен: " + (bodyMassIndex / 100) + " кг/м^2");
    }
}
