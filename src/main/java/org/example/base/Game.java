package org.example.base;

import org.example.JogoCenario;

public class Game {
    public static void main(String[] args) {
        JogoCenario jogo = new JogoCenario(400, 800);
        jogo.carregar();
    }
}
