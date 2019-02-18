import java.util.Scanner;

class DinosWeightConversion
{
    public static final double GRAMMS_IN_TONNE = 1_000_000;
    public static final double GRAMMS_IN_CENTNERE = 100_000;
    public static final double GRAMMS_IN_STONE = 6_350.29318;
    public static final double GRAMMS_IN_POUND = 453.59237;
    public static final double GRAMMS_IN_POOD = 16_380.4815;
    
    public static void main(String[] args)
    {
        showTaskDetails();
        runDialog();
    }
    
    private static void showTaskDetails()
    {
        print("Практическое задание для тренинга #01\n");
        print("Task 2:\n. Масса динозавра задаётся в граммах. Разработайте программу, которая,\n");
        print("вычисляет, сколько это килограммов, центнеров и т.д.\n");
    }
    
    private static void runDialog()
    {
        print("Greetings! This application will show you how much your Dino weights in various units of mass\n");
        
        print("Please, input your Dinosour weight is gramms: ");
        double weight = readDoubleFromConsole();
        
        print("Nice! Let us see how heavy your little pet is in...\n");
        print("    tonnes: " + convertWeight(weight, "tonne") + "\n");
        print("  centners: " + convertWeight(weight, "centner") + "\n");
        print("    stones: " + convertWeight(weight, "stone") + "\n");
        print("    pounds: " + convertWeight(weight, "pound") + "\n");
        print("     poods: " + convertWeight(weight, "pood") + "\n");

    }
    
    private static Double convertWeight(double value, String type)
    {
        switch(type)
        {
            case "tonne": return value / GRAMMS_IN_TONNE;
            case "centner": return value / GRAMMS_IN_CENTNERE;
            case "stone": return value / GRAMMS_IN_STONE;
            case "pound": return value / GRAMMS_IN_POUND;
            case "pood": return value / GRAMMS_IN_POOD;
        }
        
        return null;
    }
    
    private static double readDoubleFromConsole()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
    
    private static void print(String text)
    {
        System.out.print(text);
    }
}
