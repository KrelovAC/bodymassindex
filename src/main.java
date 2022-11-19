public class main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();

        double mass = 66;
        double hight = 1.55;
        double bmi = service.calculate(mass,hight);
        System.out.println(bmi + " - индекс массы тела");



    }
}
