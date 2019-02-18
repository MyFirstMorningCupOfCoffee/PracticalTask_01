import java.util.Scanner;

class TwoTowns
{
   
    public static void main(String[] args)
    {
        showTaskDetails();
        runDialog();
    }
    
    private static void showTaskDetails()
    {
        print("Практическое задание для тренинга #01\n");
        print("Task 4:\n. Значение расстояния между двумя городами задаётся в сантиметрах.\n");
        print("Разработайте программу, которая вычисляет, сколько это километров и метров.\n");
    }
    
    private static void runDialog()
    {
        print("Greetings! This application will show you how big distance between two towns in kilometres and metres is.\n");
        
        print("Please, input neccessary distance value in centimetres: ");
        double distance = readDoubleFromConsole();
        
        print("Nice! Now let us see how far these towns are from each other.\n\n");
        print("    metres: " + distance / 100 + "\n");
        print("kilometres: " + distance / (100 * 1000) + "\n");

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
