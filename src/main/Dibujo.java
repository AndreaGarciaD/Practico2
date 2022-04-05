package main;

import javax.swing.*;
import java.awt.*;

public class Dibujo extends JPanel {

    Vista vista = new Vista();
    private int xMain;
    private int yMain;
    private int complejidadMain;
    private int tamanoMain;

    public Dibujo(int x, int y, int tamano, int complejidad){
        this.xMain = x;
        this.yMain = y;
        this.tamanoMain = tamano;
        this.complejidadMain = complejidad;
        this.setBackground(Color.CYAN);
    }

    protected void paintComponent(Graphics g){
            super.paintComponent(g);
            vista.dibujar(g, this.xMain, this.yMain, this.tamanoMain, this.complejidadMain);
    }

}
