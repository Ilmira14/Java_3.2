public class BmiService {
    public double calculate(int weight, int height){
        double bodyMassIndex = weight * 10000 * 100 / height / height; // * 100 чтобы получить число с сотыми долями

        return bodyMassIndex;
    }
}
