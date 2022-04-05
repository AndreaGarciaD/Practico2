package main;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ventana extends JFrame implements MouseListener {

    /*int x = 10;
    int y = 10;
    int tamano = 243;
    int complejidad = 6;*/

    Dibujo panel_dibujo = new Dibujo();

    //Dibujo panel_dibujo = new Dibujo(x, y, tamano, complejidad);

    public Ventana() {
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        panel_dibujo.addMouseListener(this);
        cargarElementos();
    }

    public void cargarElementos() {
        this.add(panel_dibujo);
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        if (e.getButton() == MouseEvent.BUTTON1) {
            System.out.println("hola");
            panel_dibujo.addAlfombra(x,y,243,6);
        }
        if (e.getButton() == MouseEvent.BUTTON3) {
            System.out.println("hola2");
            panel_dibujo.addAlfombra(x,y,200,3);
        }
        panel_dibujo.repaint(); //observer!

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
