import java.util.Scanner;

class CandyShop
{
   
    public static void main(String[] args)
    {
        showTaskDetails();
        startDialog();
    }
    
    private static void showTaskDetails()
    {
        println("Практическое задание для тренинга #01");
        println("Task 6:\n. Разработать программу вычисления того, сколько стоит один кг шоколадных");
        println("конфет и один кг желатинок, а также во сколько раз шоколадные конфеты дороже (дешевле) желатинок,");
        println("если известно, что X кг шоколадных конфет стоит A бел. рублей, а Y кг желатинок стоит B бел. рублей.\n");
    }
    
    private static void startDialog()
    {
        println("Greetings! This application will help you to calculate price of chocolate and chewing candies you bought.");
        
        double quantity_chock, quantity_chew, cost_chock, cost_chew;
        
        print("Please, input quantity of chocolate candies you bought (in kg): ");
        quantity_chock = readDoubleFromConsole();
        print("Please, tell, how much money did you pay for them: ");
        cost_chock = readDoubleFromConsole();
        println("And now the same data for the chewing candies, please");
        print("- the quantity you bought (kg): ");
        quantity_chew = readDoubleFromConsole();
        print("- the amount of money you paid: ");
        cost_chew = readDoubleFromConsole();
        
        double chocolatePrice = calculatePrice(cost_chock, quantity_chock);
        double chewingPrice = calculatePrice(cost_chew, quantity_chew);
        
        println("");
        println("All right then, now we can do our little calculations.");
        println("So, the price of 1 kilogramm of candies is ");
        println(" chocolate ones: " + chocolatePrice + " BYN");
        println("   chewing ones: " + chewingPrice + " BYN");
        println("");
        
        println("And in case you are eager to know:");
        print("Chocolate candies' price ");
        if(chewingPrice == chocolatePrice)
        {
            println("is the very same as chewing candies' one! Amazing, isn't it?");
        }
        else if(chocolatePrice > chewingPrice)
        {
            println("is bigger than chewing candies' one in " + chocolatePrice / chewingPrice + " times!");
        }
        else
        {
            println("is lesser than chewing candies' one in " + chewingPrice / chocolatePrice + " times!");
            println("I say! What are these candies made of - chewing gold or something like that?");
        }
        
        
        
    }
    
    private static double calculatePrice(double cost, double quantity)
    {
        return cost / quantity;
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
    
    private static void println(String text)
    {
        System.out.println(text);
    }
}
