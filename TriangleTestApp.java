import java.util.Scanner;

class TriangleTestApp

{
	public static void main(String[] args)
	{
		welcomeUser();
		runDialog();
	}
	
	private static void welcomeUser()
	{
		print("Практическое задание для тренинга #01\n");
		print("Task:\n1. Создать простейшее приложение, которое определяет, \nявляются ли три заданные пользователем величины сторонами треугольника.\n");		
	}
	
	private static void runDialog()
	{
		print("Greetings! This application checks if the values you input can be lenghs of sides of a single triangle\n");
		
		print("Please, input value 1: ");
		double sideA = readDoubleFromConsole();
		print("Please, input value 2: ");
		double sideB = readDoubleFromConsole();
		print("Please, input value 3: ");
		double sideC = readDoubleFromConsole();
		
		boolean canExist = isTriangle(sideA, sideB, sideC);
		
		print("The values you entered are " + sideA + ", " + sideB + ", " + sideC + "\n");
		print("Result: ");
    
		if(canExist)
		{
			print("Yes, triangle with such sides can exist\n");
		}
		else
		{
			print("No, triangle with such sides cannot exist\n");
		}
			
	}
	
	private static boolean isTriangle(double sideA, double sideB, double sideC)
	{
		return (sideA < sideB + sideC) 
			&& (sideB < sideA + sideC) 
			&& (sideC < sideA + sideB);
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
