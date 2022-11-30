import java.util.Scanner;

public class CalculadoraLoop {
    public static void main(String[] args) {
        String operacao = "";
        do{
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2, resultado;

        System.out.println("Digite um número:");
        numero1 = entrada.nextDouble();
        System.out.println("Digite outro número:");
        numero2 = entrada.nextDouble();

        System.out.println("Selecione a operação:");

        Scanner entrada2 = new Scanner(System.in);
        operacao = entrada2.nextLine();

            switch (operacao) {
                case "+" -> resultado = numero1 + numero2;
                case "-" -> resultado = numero1 - numero2;
                case "*" -> resultado = numero1 * numero2;
                case "/" -> resultado = numero1 / numero2;
                default -> {
                    resultado = 0;
                    System.out.println("Declaração inválida");
                }
            }
        System.out.println(resultado);
        } while(!operacao.equals("FIM") );
    }
}
