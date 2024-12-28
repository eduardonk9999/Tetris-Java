package org.example;

import java.awt.*;

public class Peca {
    public static Color[] Cores = {
            Color.GREEN, Color.ORANGE,
            Color.YELLOW, Color.CYAN, Color.BLUE,
            Color.PINK, Color.WHITE
    };

    public static final int[][][] PECAS = {
            {
                    { 0, 1, 0 },
                    { 0, 1, 0 },
                    { 1, 1, 0 }
            },
            {
                    { 0, 1, 0 },
                    { 0, 1, 0 },
                    { 0, 1, 1 }
            },
            {
                    { 1, 1, 1 },
                    { 0, 1, 0 },
                    { 0, 0, 0 }
            },
            {
                    { 1, 0, 0 },
                    { 1, 1, 0 },
                    { 0, 1, 0 }
            },
            {
                    { 0, 0, 1 },
                    { 0, 1, 1 },
                    { 0, 1, 0 }
            },
            {
                    { 1, 1 },
                    { 1, 1 }
            },
            {
                    { 0, 1, 0, 0 },
                    { 0, 1, 0, 0 },
                    { 0, 1, 0, 0 },
                    { 0, 1, 0, 0 }
            }
    };
}


