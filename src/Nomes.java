import java.util.Scanner;

public class Nomes {
    public static void main(String[] args) {
        String[] nome = new String[10];
        System.out.println("Digite 10 nomes: ");
        for(int i=0; i< nome.length; i++){
            Scanner scanner = new Scanner(System.in);
            nome[i] = scanner.nextLine();
        }
        for(int i=0; i< nome.length; i++){
            System.out.println("Nome: " + nome[i]);
            System.out.println("Posição: " + i);
        }
    }
}
