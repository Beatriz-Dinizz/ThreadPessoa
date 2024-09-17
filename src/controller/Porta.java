package controller;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Porta {
    private Lock porta = new ReentrantLock();

    public void cruzarPorta(String nomePessoa) {
        porta.lock();
        try {
            System.out.println(nomePessoa + " está tentando cruzar a porta.");
            Thread.sleep((int) (Math.random() * 1000) + 1000);
            System.out.println(nomePessoa + " cruzou a porta!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            porta.unlock();
        }
    }
}
