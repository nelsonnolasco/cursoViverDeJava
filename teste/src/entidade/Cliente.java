package entidade;

import java.sql.SQLOutput;

public class Cliente {

    String nome;

    String cpf;

    int altura;

    void verificaAltura() {
        if (this.altura >= 185) {
            System.out.println("Altura mínima ok!");
        }else {
            System.out.print("Altura mínima insuficiente");
        }

    }

}
