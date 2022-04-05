package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ventana extends JFrame implements MouseListener {

    Dibujo dibujo = new Dibujo(10,10,243,6);

    public Ventana() {
        setSize(800, 600);
        //getContentPane().setBackground(Color.CYAN);
        setVisible(true);
        add(dibujo);
        //this.addMouseListener(this);
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        /*int x = e.getX();
        int y = e.getY();
        if(e.getButton() == MouseEvent.BUTTON1){
            System.out.println("hola");
            Dibujo dibujo = new Dibujo(x,y,243,6);
            dibujo.repaint();
            this.add(dibujo);

        }*/

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) {
        new Ventana();
    }
}
