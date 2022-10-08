import java.util.Scanner;

class Soma {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Digite um número:");
        double numero1 = n.nextDouble();
        System.out.println("Digite outro número:");
        double numero2 = n.nextDouble();
        double soma = numero1 + numero2;
        System.out.println("A soma é: " + soma);
    }
}
