package ru.vsu.cs.kg2021.g41.petrov_a_a.kg1;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Teeth {
    public static void drawTeeth(Graphics2D gr, int x, int y){
        GeneralPath gp = new GeneralPath();

        int x1 = 680;
        int x2 = 670;
        int x3 = 660;

        while (x1 > 590){
            gp.moveTo(x1,230);
            gp.lineTo(x2,250);
            gp.lineTo(x3,230);
            gp.closePath();
            gr.fill(gp);
            gr.setColor(Color.white);
            x1 -= 10;
            x2 -= 10;
            x3 -= 10;
        }

        int dx1 =680;
        int dx2 =670;
        int dx3 =660;

        while (dx1 > 590){
            gp.moveTo(dx1,270);
            gp.lineTo(dx2,260);
            gp.lineTo(dx3,270);
            gp.closePath();
            gr.fill(gp);
            gr.setColor(Color.white);
            dx1 -= 10;
            dx2 -= 10;
            dx3 -= 10;
        }

        //teeth up
      /*  gp.moveTo(680,230);
        gp.lineTo(670,250);
        gp.lineTo(660,230);
        gp.closePath();
        gr.fill(gp);
        gr.setColor(Color.white);



        gp.moveTo(660,230);
        gp.lineTo(650,250);
        gp.lineTo(640,230);
        gp.closePath();
        gr.fill(gp);
        gr.setColor(Color.white);

        gp.moveTo(640,230);
        gp.lineTo(630,250);
        gp.lineTo(620,230);
        gp.closePath();
        gr.fill(gp);
        gr.setColor(Color.white);

        gp.moveTo(620,230);
        gp.lineTo(610,250);
        gp.lineTo(600,230);
        gp.closePath();
        gr.fill(gp);
        gr.setColor(Color.white);

        gp.moveTo(600,230);
        gp.lineTo(590,250);
        gp.lineTo(580,230);
        gp.closePath();
        gr.fill(gp);
        gr.setColor(Color.white);

        */

        //teeth down

        /*
        gp.moveTo(680,270);
        gp.lineTo(670,260);
        gp.lineTo(660,270);
        gp.closePath();
        gr.fill(gp);
        gr.setColor(Color.white);

        gp.moveTo(660,270);
        gp.lineTo(650,260);
        gp.lineTo(640,270);
        gp.closePath();
        gr.fill(gp);
        gr.setColor(Color.white);

        gp.moveTo(640,270);
        gp.lineTo(630,260);
        gp.lineTo(620,270);
        gp.closePath();
        gr.fill(gp);
        gr.setColor(Color.white);

        gp.moveTo(620,270);
        gp.lineTo(610,260);
        gp.lineTo(600,270);
        gp.closePath();
        gr.fill(gp);
        gr.setColor(Color.white);

        gp.moveTo(600,270);
        gp.lineTo(590,260);
        gp.lineTo(580,270);
        gp.closePath();
        gr.fill(gp);
        gr.setColor(Color.white);
        
         */

    }
}
