package ru.vsu.cs.kg2021.g41.petrov_a_a.kg1;

import javax.swing.*;
import java.awt.*;

public class Mywingow extends JFrame{

    private final Drawpanel dp;

    public Mywingow() throws HeadlessException {
        dp = new Drawpanel();
        add(dp);
    }

}
