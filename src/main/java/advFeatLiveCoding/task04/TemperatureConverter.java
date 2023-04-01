package advFeatLiveCoding.task04;

public class TemperatureConverter {
    public static double convertToCelsius(double fahrenheit) {
        if (fahrenheit < -459) {
            throw new IllegalArgumentException("Too low fahrenheit" + fahrenheit);
        }
        return (fahrenheit - 32) / 1.8;
    }

    public static double convertToFahrenheit(double celsius) {
        if (celsius < -273) {
            throw new IllegalArgumentException("Too low celsius " + celsius);
        }
        return (celsius * 1.8) + 32;
    }


    public static void main(String[] args) {
        System.out.println(convertToCelsius(-460));
        System.out.println(convertToFahrenheit(0));
    }
}
