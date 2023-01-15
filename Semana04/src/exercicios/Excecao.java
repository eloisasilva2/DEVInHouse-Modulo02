package exercicios;

public class Excecao extends Throwable {
    public String mensagem;
    Excecao(){
        this.mensagem = "Nome é obrigatório!";
    }
}
