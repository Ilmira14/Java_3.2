public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 43; // кг
        int height = 158; // см
        int bodyMassIndex = service.calculate(weight, height);

        System.out.println("Индекс массы тела равен: " + bodyMassIndex + " кг/м^2");
    }
}
