public class BmiService {
    public double calculate (double massa, double height){
        double h = height * height;
        double index = massa / h;
        return (int) index;
    }
}
