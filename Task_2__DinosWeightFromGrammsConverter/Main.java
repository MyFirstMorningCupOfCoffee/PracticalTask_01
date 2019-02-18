import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        welcomeUser();
        runDialog();
    }
    
    private static void welcomeUser()
    {
        print("Практическое задание для тренинга #01\n");
        print("Task 2:\nМасса динозавра задаётся в граммах. Разработайте программу, которая,\n");
        print("вычисляет, сколько это килограммов, центнеров и т.д.\n");
    }
    
    private static void runDialog()
    {
        print("Greetings! This application will show you how much your Dino weights in various metric units of mass\n");
        
        print("Please, input your Dinosour weight is gramms: ");
        double weight = readDoubleFromConsole();

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
