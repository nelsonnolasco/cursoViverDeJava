package aula;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente ("Nelson", "Nolasco", new Date());
        Cliente cliente2 = new Cliente ("Sandra", "Sandrinha", new Date());
        Cliente cliente3 = new Cliente ("Ana Lúcia", "Lucinha", new Date());

        System.out.println("O nome do cliente 2 é: " + cliente2.nome + " e seu apelido, "
                + cliente2.apelido + " e a data de hoje é " + new Date());

        System.out.println("O nome do cliente 3 é: " + cliente3.nome + " e seu apelido, "
                + cliente3.apelido + " e a data de hoje é " + new Date());

    }
}
