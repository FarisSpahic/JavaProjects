/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingassignment;

import java.awt.Color;
import javax.swing.JFrame;

public class PopUpScreen {

    private Color c = Color.WHITE;
    private int r, g, b;
    private JFrame puf;

    public PopUpScreen() {
        puf = new JFrame();
    }

    public void addFrame() {
        puf.setSize(300, 300);
        puf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        puf.setVisible(true);
    }

    public void setColor(Color c) {
        this.c = c;
    }

    public void setRGBColor(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public void setNewBackground() {
        puf.getContentPane().setBackground(new Color(r, g, b));

    }

    public void disposeFrame() {
        puf.dispose();
    }

    public boolean isOnScreen() {
        if (puf.isActive() || puf.isShowing()) {
            return true;
        } else {
            return false;
        }
    }

}
