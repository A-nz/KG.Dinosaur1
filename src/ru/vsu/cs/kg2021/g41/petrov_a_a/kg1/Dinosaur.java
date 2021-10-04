package ru.vsu.cs.kg2021.g41.petrov_a_a.kg1;

import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.RoundRectangle2D;

public class Dinosaur {

    public static void drawDinosaur(Graphics2D gr, Graphics2D g, double x, double y) {
        GeneralPath gp = new GeneralPath();

        gp.moveTo(350,460);
        gp.lineTo(520,300);
        gp.lineTo(520,180);
        gp.lineTo(600,180);
        gp.lineTo(680,230);
        gp.lineTo(580,230);
        gp.lineTo(580,270);
        gp.lineTo(680,270);
        gp.lineTo(580,310);
        gp.lineTo(470,480);

        //leg
        gp.lineTo(520,570 );
        gp.lineTo(520,590 );
        gp.lineTo(450,670 );
        gp.lineTo(500,700 );
        gp.lineTo(380,700 );
        gp.lineTo(460,590 );
        gp.lineTo(360,540 );

        //tail
        gp.curveTo(220,520, 170,420, 160,350);
        gp.curveTo(210,430, 250,460, 350,460);
        gp.closePath();
        g.fill(gp);

        //arm
        gp.moveTo(548,360);
        gp.lineTo(585,365);
        gp.lineTo(585,380);
        gp.closePath();
        g.fill(gp);


        //teeth up
        g.drawLine(680,230 ,670,250);
        g.drawLine(670,250 ,660,230);
        g.drawLine(660,230 ,650,250);
        g.drawLine(650,250 ,640,230);
        g.drawLine(640,230 ,630,250);
        g.drawLine(630,250 ,620,230);
        g.drawLine(620,230 ,610,250);
        g.drawLine(610,250 ,600,230);
        g.drawLine(600,230 ,590,250);
        g.drawLine(590,250 ,580,230);

        //teeth down
        g.drawLine(680,270 ,670,260);
        g.drawLine(670,260 ,658,270);
        g.drawLine(658,270 ,650,260);
        g.drawLine(650,260 ,640,270);
        g.drawLine(640,270 ,630,260);
        g.drawLine(630,260 ,620,270);
        g.drawLine(620,270 ,610,260);
        g.drawLine(610,260 ,600,270);
        g.drawLine(600,270 ,590,260);
        g.drawLine(590,260 ,580,270);
        gr.setColor(Color.BLACK);

        //old arm
       /* g.drawLine(548,360 ,585,365 );
        g.drawLine(585,365 ,585,380 );
        g.drawLine(585,380 ,575,370 );
        g.drawLine(535,380 ,575,370 );
        */

    }

}
