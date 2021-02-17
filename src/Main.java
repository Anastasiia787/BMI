public class Main {
    public static void main(String[] args) {
        int weightKg = 50;
        double growthM = 1.5;
        double bodyMassIndex = weightKg / (growthM * growthM);
        System.out.println(bodyMassIndex);
        System.out.println("BMI VALUES:");
        System.out.println("Underweight: under 18.5");
        System.out.println("Normal: 18.5-25");
        System.out.println("Overweight: 25-30");
        System.out.println("Obesity: 30 or more");

    }
}
