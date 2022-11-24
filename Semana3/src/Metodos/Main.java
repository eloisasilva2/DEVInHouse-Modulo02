package Metodos;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.soma(2.0,2.0));

        System.out.println(calculadora.divisao(30.0,5.0));
        System.out.println(calculadora.multiplicacao(30.0,5.0));
        System.out.println(calculadora.subtracao(30.0,5.0));

        calculadora.printHistoricos();

    }


}
