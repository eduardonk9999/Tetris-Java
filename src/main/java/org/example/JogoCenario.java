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
        } else {
            idPeca = idPrxPeca;
        }

        idPrxPeca = rand.nextInt(Peca.PECAS.length);

        if (idPeca == idPrxPeca) {
            idPrxPeca = rand.nextInt(Peca.PECAS.length);
        }

        peca = Peca.PECAS[idPeca];
        corPeca = Peca.Cores[idPeca];

    }

    public void adcionaPecaNaGrade() {
        for(int col = 0; col < peca.length; col++) {
            for(int lin = 0; lin < peca[col].length; lin++) {
                if(peca[lin][col] != 0) {
                    grade[col + ppx][lin + ppy] = idPeca;
                }
            }
        }
    }

    @Override
    public void desenhar(Graphics2D g) {
        for(int col = 0; col < grade.length; col++) {
            for(int lin = 0; lin < grade[0].length; lin++) {
                int valor = grade[col][lin];

                if(valor == ESPACO_VAZIO) {
                    continue;
                }
                if (valor == LINHA_COMPLETA) {
                    g.setColor(Color.RED);
                } else {
                    g.setColor(Peca.Cores[valor]);
                }
                int x = col * largBloco + ESPACAMENTO;
                int y = lin * altBloco + ESPACAMENTO;

                 g.fillRect(x, y, largBloco - ESPACAMENTO, altBloco - ESPACAMENTO);
            }
        }

        if (peca != null) {
            g.setColor(corPeca);

            for(int col = 0; col < peca.length; col++) {
                for(int lin = 0; lin < peca.length; lin++){
                    if(peca[lin][col] != 0) {
                        int x = (col + ppx) * largBloco + ESPACAMENTO;
                        int y = (lin + ppy) * altBloco + ESPACAMENTO;

                        g.fillRect(x, y, largBloco - ESPACAMENTO, altBloco - ESPACAMENTO);
                    } else if (depurar) {
                        g.setColor(Color.PINK);
                        int x = (col + ppx) * largBloco + ESPACAMENTO;
                        int y = (lin + ppy) * altBloco + ESPACAMENTO;

                        g.setColor(corPeca);
                    }
                }
            }
        }


        int miniatura = largBloco  / 4;
        int[][] prxPeca = Peca.PECAS[idPrxPeca];
        g.setColor(Peca.Cores[idPrxPeca]);

        for (int col = 0; col < prxPeca.length; col++) {
            for (int lin = 0; lin < prxPeca[col].length; lin++) {
                if (prxPeca[lin][col] == 0) {
                    continue;
                }
                int x = col * miniatura + ESPACAMENTO;
                int y = lin * miniatura + ESPACAMENTO;

                g.fillRect(x, y, miniatura - ESPACAMENTO, miniatura - ESPACAMENTO);
            }
        }


    }

    public boolean validaMovimento(int[][] peca, int px, int py){
        if(peca == null) {
            return false;
        }

        for (int col = 0; col < peca.length; col++){
            for(int lin = 0; lin < peca.length; lin++) {
                if(peca[lin][col] === 0) {
                    continue;
                }
                // Parei AQUI PAG 111
            }
        }
    }



    @Override
    public void descarregar() {

    }

    @Override
    public void atualizar() {

    }


}
