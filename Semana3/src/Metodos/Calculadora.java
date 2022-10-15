
package Metodos;
import java.util.ArrayList;
import java.util.List;

public class Calculadora {
    List<Double> historicoResultado = new ArrayList<>();

    public Double soma(Double numero1, Double numero2){
        Double resultado =  numero1 + numero2;
        System.out.println("Soma Realizada!!");
        historicoResultado.add(resultado);
        return resultado;
    }

    public Double subtracao(Double numero1, Double numero2){
        Double resultado =  numero1 - numero2;
        System.out.println("Subtracao Realizada!!");
        historicoResultado.add(resultado);
        return resultado;
    }

    public Double multiplicacao(Double numero1, Double numero2){
        Double resultado =  numero1 * numero2;
        System.out.println("Multiplicacao Realizada!!");
        historicoResultado.add(resultado);
        return resultado;
    }

    public Double divisao(Double numero1, Double numero2){
        Double resultado =  numero1 / numero2;
        System.out.println("Divisão Realizada!!");
        historicoResultado.add(resultado);
        return resultado;
    }

    public void printHistoricos() {
        historicoResultado.forEach(r -> System.out.println(r));

        for (Double resultado : historicoResultado) {
            System.out.println("O resultado foi: " + resultado);
        }
        for (int i = 0; i < historicoResultado.size(); i++) {
            System.out.println(
                    "O resultado da conta " + i + " foi: " + historicoResultado.get(i)
            );
        }
    }
}
