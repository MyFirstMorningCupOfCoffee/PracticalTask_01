import java.util.Scanner;

class TemperatureConversion
{
   
    public static void main(String[] args)
    {
        showTaskDetails();
        
        if(args.length < 2)
        {
            showHelp();
            return;
        }

        double tempC = getTempInCelsius(args[0], args[1]);
        double tempK = getTempInKelvin(tempC);
        double tempF = getTempInFahrenheit(tempC);
        
        println("Transfered temperature:");
        println(tempC + " °C");
        println(tempK + "  K");
        println(tempF + " °F");
    }
    
    private static void showTaskDetails()
    {
        println("Практическое задание для тренинга #01");
        println("Task 7:\n. Разработайте программу-конвертор для различных шкал температур (из градусов Цельсия");
        println("в градусы Фаренгейта или Кельвина и наоборот)");
        println("");
    }
    
    private static double getTempInCelsius(String value, String system)
    {
        Scanner sc = new Scanner(value);
        double initialTemperature = sc.nextDouble();
        
        String initialTempSystem = system;
        
        double initialTemperatureInCelsius;
        initialTemperatureInCelsius = convertToCelsius(initialTemperature, initialTempSystem);
        return initialTemperatureInCelsius;
    }
    
    private static double getTempInKelvin(double temperatureInCelsius)
    {
        return temperatureInCelsius + 273.15;
    }
    
    private static double getTempInFahrenheit(double temperatureInCelsius)
    {
        return temperatureInCelsius * 9 / 5 + 32;
    }
    
    private static Double convertToCelsius(double value, String system)
    {
        switch(system)
        {
            case("C"): return value;
            case("K"): return value - 273.15;
            case("F"): return (value - 32) * 5 / 9;
            default: return null;
        }
    }
    
    
    private static void showHelp()
    {
        println("This program convert temperature from one temperature system to other ones");
        println("To use it just run the program with %T[space]%S parameters, where:");
        println("%T is the temperature you want to convert");
        print("%S - shorten name of temperature system you want to use, ");
        println("possible variants:");
        println("C - Celsius scale (°C)");
        println("K - Kelvin scale (K)");
        println("F - Fahrenheit scale (°F)");
    }
    
    private static void print(String text)
    {
        System.out.print(text);
    }
    
    private static void println(String text)
    {
        System.out.println(text);
    }
}
