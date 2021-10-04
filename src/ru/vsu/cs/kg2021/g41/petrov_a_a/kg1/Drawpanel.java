package ru.vsu.cs.kg2021.g41.petrov_a_a.kg1;

import ru.vsu.cs.kg2021.g41.petrov_a_a.kg1.Background.Ground;
import ru.vsu.cs.kg2021.g41.petrov_a_a.kg1.Background.Stone;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.GeneralPath;

public class Drawpanel extends JPanel {
    public Drawpanel() {
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        GradientPaint gradient = new GradientPaint(
                400f, 100f, new Color(255, 185, 9, 255),
                1200f, 900f, new Color(255, 31, 31, 255));
        ((Graphics2D) g).setPaint(gradient);
        g.fillRect(0, 0, 1000, 800);

        Graphics2D gr = (Graphics2D) g;

        drawSun(gr, 100, 100, 30, 80, 13, Color.red);
        Dinosaur.drawDinosaur(gr, gr,1,2);
        Teeth.drawTeeth(gr, 680,230);
        Ground.drawGround(gr,0, 700, 1000, 600);
        Stone.drawStone(gr, 100, 670, 150, 100);
        Woodplate.drawWoodPlate(gr, 100, 430, 30, 270, 30, 440, 170, 100, 35, 500);

    }


    public static void drawSun(Graphics2D g, int x, int y, int rInner, int rOuter, int n, Color c){
        Color oldC = g.getColor();
        g.setColor(c);
        g.fillOval(x- rInner, y-rInner, 2*rInner, 2*rInner);
        double da =2*Math.PI / n;
        for (int i=0; i< n; i++){
            double a = da*i;
            double x1 = x + rInner * Math.cos(a);
            double y1 = y + rInner * Math.sin(a);
            double x2 = x + rOuter * Math.cos(a);
            double y2 = y + rOuter * Math.sin(a);
            g.drawLine((int)x1, (int) y1, (int) x2, (int) y2);
        }
        g.setColor(oldC);
    }
}
