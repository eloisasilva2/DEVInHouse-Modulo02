package exercicios;

public class Main {
    public static void main(String[] args) throws Exception {


        Aluno aluno = new Aluno("João",  20, "Java", "123GRF");

        Mentor mentor = new Mentor("Rodrigo",  30, "Java");

        Coordenador coordenador = new  Coordenador("Paulo",  40, 3);
        try {
            aluno.obterInformacoes();
            mentor.obterInformacoes();
            coordenador.obterInformacoes();
        } catch (Excecao e){
            System.out.println(e.mensagem);

        }

        finally {
            System.out.println("\nProcesso finalizado.");
        }

    }
}
