public class BodyMassIndex {
    public double calculate(double mass, double hight){
        double f;
        f = Math.pow(hight,2); //f = hight * hight;
        double s;
        s = mass / f;
        return s;
    }
}
