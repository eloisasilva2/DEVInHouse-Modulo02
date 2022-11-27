import java.util.Scanner;

class Calculadora {
    public static void main(String[] args) {
        //Para receber os números:
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2, resultado;


        System.out.println("Digite um número:");
        numero1 = entrada.nextDouble();
        System.out.println("Digite outro número:");
        numero2 = entrada.nextDouble();

        System.out.println("Selecione a operação:");

        Scanner entrada2 = new Scanner(System.in);
        String operacao = entrada2.nextLine();

        switch (operacao){
            case "+":
            resultado = numero1 + numero2;
            break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                resultado = numero1 / numero2;
                break;
            default:
                resultado = 0;
                System.out.println("Declaração inválida");
        }

        System.out.println(resultado);
    }
}
