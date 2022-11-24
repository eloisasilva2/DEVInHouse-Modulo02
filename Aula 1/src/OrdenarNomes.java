import java.util.*;

public class OrdenarNomes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> listaDeNomes = new ArrayList<>();
        String continuar = "";
                do {
                    System.out.println("Insira um novo nome na lista: (digite 'fim' para finalizar a aplicacao)");
                    String adiciona = in.next();
                    if(!Objects.equals(adiciona, "fim")){
                        listaDeNomes.add(adiciona);
                    }else {
                        continuar = adiciona;
                    }
                }while (!Objects.equals(continuar, "fim"));


                PriorityQueue<String> listaOrdenada = new PriorityQueue<>(listaDeNomes);

                listaOrdenada.forEach(item -> {
                    System.out.println(item);
                });
            }
        }


