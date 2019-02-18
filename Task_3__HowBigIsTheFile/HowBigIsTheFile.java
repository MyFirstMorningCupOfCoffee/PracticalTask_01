import java.util.Scanner;

class HowBigIsTheFile
{
    public static final double DECIMAL__BYTES_IN_KB = 1000;
    public static final double DECIMAL__BYTES_IN_MB = 1000E1;
    public static final double DECIMAL__BYTES_IN_GB = 1000E2;
    public static final double DECIMAL__BYTES_IN_TB = 1000E3;
    public static final double DECIMAL__BYTES_IN_PB = 1000E4;
    public static final double DECIMAL__BYTES_IN_EB = 1000E5;
    public static final double DECIMAL__BYTES_IN_ZB = 1000E6;
    public static final double DECIMAL__BYTES_IN_YB = 1000E7;
    
    public static final double BINARY__BYTES_IN_KIB_POW_POWER = 1;
    public static final double BINARY__BYTES_IN_MIB_POW_POWER = 2;
    public static final double BINARY__BYTES_IN_GIB_POW_POWER = 3;
    public static final double BINARY__BYTES_IN_TIB_POW_POWER = 4;
    public static final double BINARY__BYTES_IN_PIB_POW_POWER = 5;
    public static final double BINARY__BYTES_IN_EIB_POW_POWER = 6;
    public static final double BINARY__BYTES_IN_ZIB_POW_POWER = 7;
    public static final double BINARY__BYTES_IN_YIB_POW_POWER = 8;
    
    
    
    public static void main(String[] args)
    {
        showTaskDetails();
        runDialog();
    }
    
    private static void showTaskDetails()
    {
        print("Практическое задание для тренинга #01\n");
        print("Task 3:\n. Дан общий размер файла в байтах (размер задаётся в виде целого числа).\n");
        print("Разработайте программу, которая вычисляет, сколько это килобайтов, мегабайтов и т.д.\n");
    }
    
    private static void runDialog()
    {
        print("Greetings! This application will show you how big your file is in various units\n");
        
        print("Please, input your file size in bytes: ");
        long size = readLongFromConsole();
        
        print("Nice! Let us see how big your file is.\n\n");
        
        print("1. Decimal system\n");
        print("   kilobytes (kB): " + convertBytesDecimal(size, "KB") + "\n");
        print("   megabytes (MB): " + convertBytesDecimal(size, "MB") + "\n");
        print("   gigabytes (GB): " + convertBytesDecimal(size, "GB") + "\n");
        print("   terabytes (TB): " + convertBytesDecimal(size, "TB") + "\n");
        print("   petabytes (PB): " + convertBytesDecimal(size, "PB") + "\n");
        print("    exabytes (EB): " + convertBytesDecimal(size, "EB") + "\n");
        print("  zettabytes (ZB): " + convertBytesDecimal(size, "ZB") + "\n");
        print("  yottabytes (YB): " + convertBytesDecimal(size, "YB") + "\n");
        print("\n");
        
        print("2. Bynary system\n");
        print("  kibibytes (KiB): " + convertBytesBinary(size, "KiB") + "\n");
        print("  mebibytes (MiB): " + convertBytesBinary(size, "MiB") + "\n");
        print("  gibibytes (GiB): " + convertBytesBinary(size, "GiB") + "\n");
        print("  tebibytes (TiB): " + convertBytesBinary(size, "TiB") + "\n");
        print("  pebibytes (PiB): " + convertBytesBinary(size, "PiB") + "\n");
        print("  exbibytes (EiB): " + convertBytesBinary(size, "EiB") + "\n");
        print("  zebibytes (ZiB): " + convertBytesBinary(size, "ZiB") + "\n");
        print("  yobibytes (YiB): " + convertBytesBinary(size, "YiB") + "\n");
        print("");

    }
    
    private static Double convertBytesDecimal(double value, String type)
    {
        switch(type)
        {
            case "KB": return value / DECIMAL__BYTES_IN_KB;
            case "MB": return value / DECIMAL__BYTES_IN_MB;
            case "GB": return value / DECIMAL__BYTES_IN_GB;
            case "TB": return value / DECIMAL__BYTES_IN_TB;
            case "PB": return value / DECIMAL__BYTES_IN_PB;
            case "EB": return value / DECIMAL__BYTES_IN_EB;
            case "ZB": return value / DECIMAL__BYTES_IN_ZB;
            case "YB": return value / DECIMAL__BYTES_IN_YB;
        }
        
        return null;
    }
    
    private static Double convertBytesBinary(double value, String type)
    {
        switch(type)
        {
            case "KiB": return value / Math.pow(1024, BINARY__BYTES_IN_KIB_POW_POWER);
            case "MiB": return value / Math.pow(1024, BINARY__BYTES_IN_MIB_POW_POWER);
            case "GiB": return value / Math.pow(1024, BINARY__BYTES_IN_GIB_POW_POWER);
            case "TiB": return value / Math.pow(1024, BINARY__BYTES_IN_TIB_POW_POWER);
            case "PiB": return value / Math.pow(1024, BINARY__BYTES_IN_PIB_POW_POWER);
            case "EiB": return value / Math.pow(1024, BINARY__BYTES_IN_EIB_POW_POWER);
            case "ZiB": return value / Math.pow(1024, BINARY__BYTES_IN_ZIB_POW_POWER);
            case "YiB": return value / Math.pow(1024, BINARY__BYTES_IN_YIB_POW_POWER);
        }
        
        return null;
    }
    
    private static long readLongFromConsole()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextLong();
    }
    
    private static void print(String text)
    {
        System.out.print(text);
    }
}
