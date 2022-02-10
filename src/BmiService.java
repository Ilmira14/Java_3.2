public class BmiService {
    public int calculate(int weight, int height){
        int bodyMassIndex = weight * 10000 / height / height;

        return bodyMassIndex;
    }
}
