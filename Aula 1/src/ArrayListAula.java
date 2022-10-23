package Arrays;

import java.util.ArrayList;

public class ArrayListAula {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.add("André");
        listaNomes.add("Eloisa");
        listaNomes.add("Camila");
        listaNomes.add("Michael");
        listaNomes.add("Silas");
        listaNomes.add("Arthur");
        listaNomes.add("Gabriel");
        listaNomes.add("Felipe");
        System.out.println(listaNomes);
        System.out.println("Tamanho da lista de nomes: " + listaNomes.size());

        listaNomes.remove(0);
        System.out.println(listaNomes);
        System.out.println("Tamanho da lista de nomes: " + listaNomes.size());
    }
}
