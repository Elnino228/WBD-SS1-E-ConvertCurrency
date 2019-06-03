import java.util.Scanner;
public class ConvertCurrency {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double rate=23000.0;
        System.out.println("Enter USD value: ");
        double usd=scanner.nextDouble();
        double vnd=usd*rate;
        System.out.println(usd+" USD bằng "+vnd+" VND.");
    }
}
