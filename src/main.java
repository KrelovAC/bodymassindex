public class main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();

        double mass = 40;
        double hight = 1.67;
        double bmi = service.calculate(mass,hight);
        System.out.println(bmi + " - индекс массы тела");



    }
}
