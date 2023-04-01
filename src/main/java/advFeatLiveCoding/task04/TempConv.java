package advFeatLiveCoding.task04;

public class TempConv {
    private static final float ABSOLUTE_ZERO_CELSIUS = -273;

    public static double toCelsius(float fahr) throws IllegalArgumentException {
        float celc = performConversion(fahr, (fah) -> (fah - 32)/1.8f);
        if (celc < ABSOLUTE_ZERO_CELSIUS){
            throw new IllegalArgumentException("temp cannot be below absloute zero");
        }
        return celc;
    }
    public static double toFahrenheit(float cel) throws IllegalArgumentException {
        if (cel < ABSOLUTE_ZERO_CELSIUS){
            throw new IllegalArgumentException("temp cannot be below absloute zero");
        }
        return performConversion(cel, (celsius) -> (celsius * 1.8f) + 32);
    }

    private static float performConversion(float temp, ConvertTemp convertTemp){
        return convertTemp.convert(temp);
    }
}
