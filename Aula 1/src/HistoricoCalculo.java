import java.util.Scanner;
import java.util.ArrayList;

public class HistoricoCalculo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        String perg = "Sim";
        while(!perg.equals("Fim") ){
            Scanner in = new Scanner(System.in);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um número: ");
            int a = in.nextInt();
            System.out.println("Digite outro número: ");
            int b = in.nextInt();
            System.out.println("O que você quer fazer com os números? Digite\n1-Somar" +
                    "\n2-Subtrair" +
                    "\n3-Multiplicar" +
                    "\n4-Dividir");
            int c = in.nextInt();
            if(c == 1){
                int result = a+b;
                System.out.println("O resultado é: "+result);
                arrayList.add(String.valueOf(a)+"+"+String.valueOf(b)+"= "+String.valueOf(result));
                System.out.println(arrayList);
            } else if(c == 2){
                int result = a-b;
                System.out.println("O resultado é: "+result);
                arrayList.add(String.valueOf(a)+"-"+String.valueOf(b)+"= "+String.valueOf(result));
                System.out.println(arrayList);
            } else if (c == 3) {
                int result = a*b;
                System.out.println("O resultado é: "+result);
                arrayList.add(String.valueOf(a)+"*"+String.valueOf(b)+"= "+String.valueOf(result));
                for (String s : arrayList) {
                    System.out.println(s);
                }
            }else if(c == 4) {
                float result = a/b;
                System.out.println("O resultado é: "+result);
                arrayList.add(String.valueOf(a)+"/"+String.valueOf(b)+"= "+String.valueOf(result));
                System.out.println(arrayList);
            };
            System.out.println("Quer continuar calculando?\n" +
                    "Escreva: " +
                    "\nSim para continuar" +
                    "\nFim para parar");
            perg = scanner.nextLine();
        }
    }
}