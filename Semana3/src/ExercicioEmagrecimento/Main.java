package ExercicioEmagrecimento;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Alberto",  80.0, 1.80, 20);
        cliente.setNome("Alberto");
        cliente.setAltura(1.80);
        cliente.setPeso(80.0);

        Cliente cliente1 = new Cliente(80.0,1.80);
        cliente1.setNome( "Felipe");
        cliente1.setAltura( 1.80);
        cliente1.setPeso( 80.0);

        Clinica clinica = new Clinica("Don");
        Clinica clinica1 = new Clinica("Dono", new ArrayList<>());

        clinica.setListaClientes(List.of(cliente, cliente1));
        clinica.categorizaClientes();

        System.out.println(clinica.tratamento(cliente));
        System.out.println(clinica.tratamento(cliente1,10.0));
    }
}