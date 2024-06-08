public class Solution {
    public static double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        return new double[]{kelvin, fahrenheit};
    }

    public static void main(String[] args) {
        // Example 1
        double celsius1 = 36.50;
        double[] result1 = convertTemperature(celsius1);
        System.out.printf("Input: %.2f\nOutput: [%.5f, %.5f]\n", celsius1, result1[0], result1[1]);

        // Example 2
        double celsius2 = 122.11;
        double[] result2 = convertTemperature(celsius2);
        System.out.printf("Input: %.2f\nOutput: [%.5f, %.5f]\n", celsius2, result2[0], result2[1]);
    }
}
