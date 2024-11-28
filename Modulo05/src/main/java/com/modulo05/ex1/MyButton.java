package com.modulo05.ex1;

import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class MyButton extends JButton {

    public MyButton(String text, Color borderColor) {
        super(text);

        setBorder(new LineBorder(borderColor, 3));
        setFocusPainted(false);
        setContentAreaFilled(false);
        setOpaque(true);
    }
}
