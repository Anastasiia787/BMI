public class Main {
    public static void main(String[] args) {
        int weightKg = 50;
        double heightSm = 150;
        double heightM = heightSm/100;
        double bodyMassIndex = weightKg / (heightM * heightM);

        System.out.println("BMI VALUES:");
        System.out.println("Underweight: under 18.5");
        System.out.println("Normal: 18.5-25");
        System.out.println("Overweight: 25-30");
        System.out.println("Obesity: 30 or more");

        System.out.printf("Your BMI: %.2f ", bodyMassIndex);


    }
}
