import java.util.Scanner;
public class main {
    public static void Main(String[] args)  {
        var Scanner = new Scanner(System.in);
        System.out.println("informe o primeiro numero");
        var value1 = Scanner.nextInt();
        System.out.println("informe o segundo numero");
        var value2 = Scanner.nextInt();
        System.out.printf("%s + %s = %s\n",value1,value2,value1 + value2);
        Scanner.close();
    }
}
