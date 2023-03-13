public class BmiService {
    public double calculate(double massa, double height) {

        double heightBody = height * height;
        double index = massa / heightBody;
        return (int) index;
    }
}
