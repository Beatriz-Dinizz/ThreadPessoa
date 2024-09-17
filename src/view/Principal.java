package view;

import controller.Pessoa;
import controller.Porta;

public class Principal {
    public static void main(String[] args) {
        Porta porta = new Porta();

        Pessoa pessoa1 = new Pessoa("Pessoa 1", porta, 4.5);
        Pessoa pessoa2 = new Pessoa("Pessoa 2", porta, 5.2);
        Pessoa pessoa3 = new Pessoa("Pessoa 3", porta, 6.0);
        Pessoa pessoa4 = new Pessoa("Pessoa 4", porta, 4.8);
        
        pessoa1.start();
        pessoa2.start();
        pessoa3.start();
        pessoa4.start();
    }
}
