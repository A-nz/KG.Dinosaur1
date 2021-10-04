package ru.vsu.cs.kg2021.g41.petrov_a_a.kg1.Background;

import java.awt.*;

public class Ground {
    public static void drawGround(Graphics2D gr, int x, int y, int w, int h){
        gr.setColor(Color.gray);
        gr.fillRect(x, y, w, h);
    }
}
