public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Funcionario funcionario1 = new Funcionario("Arnaldo", "656565465", 4500.0);
        Funcionario funcionario2 = new Funcionario("Maria", "656565465", 6500.0);
        Funcionario funcionario3 = new Funcionario("Maria", "656565465", 6500.0);
        Funcionario funcionario4 = new Funcionario("Maria", "656565465", 6500.0);

        funcionario.adicionaValorNome("Silas");

        funcionario.setSalario(7200.0);
        funcionario1.setSalario(7230.00);
        funcionario2.setSalario(9433.20);

        System.out.println(funcionario.getFuncional());
        System.out.println(funcionario1.getFuncional());
        System.out.println(funcionario2.getFuncional());


        System.out.println(funcionario.getSalario());
        System.out.println(funcionario1.getSalario());
        System.out.println(funcionario2.getSalario());

        System.out.println(funcionario.getSaldo());
        System.out.println(funcionario1.getSaldo());
        System.out.println(funcionario2.getSaldo());




    }
}
