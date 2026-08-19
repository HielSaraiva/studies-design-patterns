import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Pessoa
        System.out.println("=== Exemplo com Pessoa ===");
        Pessoa pessoa1 = new Pessoa("Ronaldo", 65, 1.69);
        Pessoa pessoa2 = pessoa1.clonar();

        System.out.println("pessoa1 == pessoa2 ? " + (pessoa1 == pessoa2));
        System.out.println("pessoa1.equals(pessoa2)? " + pessoa1.equals(pessoa2));
        System.out.println("Pessoa 1: " + pessoa1);
        System.out.println("Pessoa 2: " + pessoa2);

        System.out.println();

        // Voo
        System.out.println("=== Exemplo com Voo ===");
        Pessoa passageiro1 = new Pessoa("Maria", 25, 1.68);
        Pessoa passageiro2 = new Pessoa("Pedro", 35, 1.80);

        List<Pessoa> passageiros = new ArrayList<>();
        passageiros.add(passageiro1);
        passageiros.add(passageiro2);

        Voo voo1 = new Voo("São Paulo", "Rio de Janeiro", "2026-08-20 18:00", passageiros);
        Voo voo2 = voo1.clonar();

        System.out.println("voo1 == voo2 ? " + (voo1 == voo2));
        System.out.println("voo1.equals(voo2)? " + voo1.equals(voo2));
        System.out.println("Voo 1: " + voo1);
        System.out.println("Voo 2: " + voo2);

        System.out.println("voo1.getPassageiros() == voo2.getPassageiros() ? " + (voo1.getPassageiros() == voo2.getPassageiros()));
        System.out.println("voo1.getPassageiros().get(0) == voo2.getPassageiros().get(0) ? " + (voo1.getPassageiros().get(0) == voo2.getPassageiros().get(0)));
    }
}
