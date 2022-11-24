public class BodyMassIndex {
    public double calculate(double mass, double hight){
        double expo = Math.pow(hight,2);
        double div = mass / expo;

        return div;
    }
}
