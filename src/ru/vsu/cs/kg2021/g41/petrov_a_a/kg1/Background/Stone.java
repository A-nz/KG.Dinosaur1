package ru.vsu.cs.kg2021.g41.petrov_a_a.kg1.Background;

import java.awt.*;

public class Stone {
    public static void drawStone(Graphics2D gr, int x, int y, int w, int h){

        gr.fillOval(x, y, w, h);
        gr.setColor(Color.gray);

    }
}
