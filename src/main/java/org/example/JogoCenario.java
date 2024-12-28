package org.example;

import org.example.base.CenarioPadrao;

import java.awt.*;
import java.util.Random;

public class JogoCenario extends CenarioPadrao {

    private static final int ESPACAMENTO = 2;
    private static final int ESPACO_VAZIO = -1;
    private static final int LINHA_COMPLETA = -2;
    private static int largBloco, altBloco;
    private int ppx, ppy;
    private final int[][] grade = new int[10][16];
    private boolean animar;
    private boolean depurar;
    private Random rand = new Random();
    private int idPeca = -1;
    private int idPrxPeca = -1;
    private Color corPeca;
    private int[][] peca;

    public JogoCenario(int largura, int altura) {
        super(largura, altura);
    }

    @Override
    public void carregar() {
        largBloco = largura / grade.length;
        altBloco = altura / grade[0].length;

        for (int i = 0; i < grade.length; i++) {
            for(int j = 0; j < grade[0].length; j++) {
                grade[i][j] = ESPACO_VAZIO;
            }
        }
        adicionaPeca();
    }

    public void adicionaPeca() {
        ppy = -2;
        ppx = grade.length / 2 - 1;


        if (idPeca == -1) {
            idPeca = rand.nextInt(Peca.PECAS.length);
        }


    }

    @Override
    public void descarregar() {

    }

    @Override
    public void atualizar() {

    }

    @Override
    public void desenhar(Graphics2D g) {

    }
}
