class SwitchVariables
{
   
    public static void main(String[] args)
    {
        showTaskDetails();
        showTaskExecutionNotes();
        
        switchStrings("_String_1_abc", "String_2_abcdef");
        switchNumbers(931, 2841);
        switchBooleans(true, false);
        switchBooleans(true, true);
        switchBooleans(false, true);
        switchBooleans(false, false);
    }
    
    private static void showTaskDetails()
    {
        println("Практическое задание для тренинга #01");
        println("Task 5:\n. Разработайте программу, которая меняет местами содержимое");
        println("двух переменных a и b, не используя для этого дополнительные переменные.\n");
    }
    
    private static void showTaskExecutionNotes()
    {
        println("Замечания к заданию:");
        println("Не думаю, что задачу можно решить в общем виде. Как максимум - раздельные решения для разных типов переменных,");
        println("да и то с некоторыми ограничениями.");
    }
    
    private static void switchStrings(String a, String b)
    {
        println("*** Switching lines ***");
        println("before:");
        println("a = " + a);
        println("b = " + b);
        
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length(), a.length());
        
        println("after:");
        println("a = " + a);
        println("b = " + b);
        println("");
    }
    
    private static void switchNumbers(int a, int b)
    {
        println("*** Switching numbers ***");
        println("before:");
        println("a = " + a);
        println("b = " + b);
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        println("after:");
        println("a = " + a);
        println("b = " + b);
        println("");
    }
    
    private static void switchBooleans(boolean a, boolean b)
    {
        println("*** Switching booleans ***");
        println("before:");
        println("a = " + a);
        println("b = " + b);
        
        if(a != b)
        {
            a = !a;
            b = !b;
        }
        
        println("after:");
        println("a = " + a);
        println("b = " + b);
        println("");
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
