public class BodyMassIndex {
    public double calculate(double mass, double hight){
        double f;
        f = hight * hight;
        double s;
        s = mass / f;
        return s;
    }
}
