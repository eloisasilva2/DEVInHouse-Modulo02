import java.util.Scanner;
import java.util.Formatter;

public class MathAula {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva uma String:");
        String s = in.nextLine();
        System.out.println("Linha como string: " + s);

        System.out.println("Escreva um Int:");
        int a = in.nextInt();
        System.out.println("Próximo inteiro: " + a);

        System.out.println("Escreva um Double:");
        double b = in.nextDouble();
        System.out.println("Próximo double: " + b);


    }
}
