public class methods8 {
    public static void main(String[] args) {
        System.out.printf("%-13s%-15s%-5s%-15s%-13s\n", "Celsius", "Fahrenheit", "|", "Fahrenheit", "Celsuis");
        System.out.printf("--------------------------------------------------------\n");

        for (double c = 40, f = 120  ; c >=31; c--, f-=10) {
            celsiusToFahrenheit(c);
            fahrenheitToCelsius(f);
            System.out.printf("%-13.1f%-15.1f%-5s%-15.1f%-13.2f\n", c, celsiusToFahrenheit(c), "|", f, fahrenheitToCelsius(f));
        }
    }
    public static double celsiusToFahrenheit(double c) {
        return (9.0 / 5) * c + 32;
    }
    public static double fahrenheitToCelsius(double f) {
        return (5.0 / 9) * (f - 32);
    }
}
