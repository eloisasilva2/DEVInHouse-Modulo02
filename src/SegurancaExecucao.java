//Recrie o programa do exercicio 6 e o coloque dentro de um bloco try-catch. Coloque um catch para o NullPointerException e um catch para uma Exception Genérica.

import java.util.*;

public class SegurancaExecucao {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            ArrayList<Integer> listaDeNomes = new ArrayList<>();
            Integer continuar = 0;
            do {
                System.out.println("Insira um novo nome na lista: (digite 'fim' para finalizar a aplicacao)");
                Integer adiciona = in.nextInt();
                if (!Objects.equals(adiciona, -1)) {
                    listaDeNomes.add(adiciona);
                } else {
                    continuar = adiciona;
                }
            } while (!Objects.equals(continuar, -1));


            Deque<Integer> listaOrdenada = new LinkedList<>(listaDeNomes);

            listaOrdenada.forEach(item -> {
                System.out.println(item);
            });

            listaOrdenada.pop();

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Exception");
            throw e;
        }
    }
}
