public class Main {
    public static void main(String [] args){
        BmiService service = new BmiService();
        double index =  service.calculate(66, 1.70);
        System.out.printf("Индекс массы тела: " + index);
    }
}