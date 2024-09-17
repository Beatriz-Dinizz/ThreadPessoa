package controller;

public class Pessoa extends Thread {
    private String nome;
    private Porta porta;
    private double velocidade; 
    private double distanciaCorredor = 200.0;

    public Pessoa(String nome, Porta porta, double velocidade) {
        this.nome = nome;
        this.porta = porta;
        this.velocidade = velocidade;
    }

    @Override
    public void run() {
        try {
            double tempoParaPercorrer = distanciaCorredor / velocidade;
            System.out.println(nome + " está caminhando e levará " + tempoParaPercorrer + " segundos para chegar na porta.");
            Thread.sleep((int) (tempoParaPercorrer * 1000)); 

            porta.cruzarPorta(nome);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
