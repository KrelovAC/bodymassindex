public class main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();

        double mass = 83;
        double hight = 1.8;
        double bmi = service.calculate(mass,hight);
        System.out.println();
        System.out.println(bmi + " - индекс массы тела");



    }
}
