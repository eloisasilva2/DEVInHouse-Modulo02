public class Calculo {
    public static void main(String[] args) {
        int numero = 10;
        numero = numero + 1;
        System.out.println(numero);
        numero += 1;
        System.out.println(numero);
        numero++;
        System.out.println(numero);

        float numeroFloat = 10.10f;
        System.out.println(numeroFloat);
        double numeroDouble = 10.10;
        System.out.println(numeroDouble);


        double resultado = (double) numeroFloat / 6;
        System.out.println(resultado);

        int resultadoResto =  52 % 5;
        System.out.println(resultadoResto);

        int resultadoMultiplicado =  52 ^ 2;
        System.out.println(resultadoMultiplicado);
    }
}
