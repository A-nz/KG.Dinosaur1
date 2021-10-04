package ru.vsu.cs.kg2021.g41.petrov_a_a.kg1;

import java.awt.*;

public class Woodplate {
    public static void drawWoodPlate(Graphics2D gr, int x, int y, int w, int h, int x1, int y1, int w1, int h1, int x3, int y3){

        gr.setColor(new Color(173, 118, 56));
        gr.fillRect(x, y, w, h);
        gr.fillRect(x1, y1, w1, h1);

        gr.setColor(Color.BLACK);
        gr.setFont(new Font("Calibri", Font.ITALIC, 28));
        gr.drawString("300 век до.н.э", x3, y3);

        gr.setColor(new Color(144, 18, 18, 255));
        gr.setFont(new Font("Calibri", Font.ITALIC, 17));
        gr.drawString("(здесь был Марти.)", x3, y3 + 30);


    }
}
