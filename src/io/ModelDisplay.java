package io;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class ModelDisplay extends JPanel implements Observer {
    private Model model;
    private static final double length = 80;
    private int ox;
    private int oy;

    public ModelDisplay(Model model) {
        this.model = model;
        this.model.add(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0,0,getWidth(), getHeight());
        g.setColor(Color.WHITE);
        ox = getWidth() / 2;
        oy = getHeight() / 2;
        g.drawLine(ox, oy, ox + dx(), oy + dy());
    }

    private int dx() {
        return (int) (length * Math.cos(model.getØ()));
    }
    private int dy() {
        return (int) (length * Math.sin(model.getØ()));
    }
}
