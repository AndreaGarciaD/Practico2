package main;

import javax.swing.*;
import java.awt.*;

public class Vista {
    private int xMain;
    private int yMain;
    private int complejidadMain;
    private int tamanoMain;

    public Vista() {

    }

    public Vista(int x, int y, int tamano, int complejidad) {
        this.xMain = x;
        this.yMain = y;
        this.tamanoMain = tamano;
        this.complejidadMain = complejidad;

    }

    public int getxMain() {
        return xMain;
    }

    public void setxMain(int xMain) {
        this.xMain = xMain;
    }

    public int getyMain() {
        return yMain;
    }

    public void setyMain(int yMain) {
        this.yMain = yMain;
    }

    public int getComplejidadMain() {
        return complejidadMain;
    }

    public void setComplejidadMain(int complejidadMain) {
        this.complejidadMain = complejidadMain;
    }

    public void dibujar(Graphics g, int x, int y, int tamano, int complejidad) {
        dibujarAlfombra(g, x, y, tamano, complejidad);
    }

    public void colocarAlfombra(int x, int y) {

    }


    public void dibujarAlfombra(Graphics g, int x, int y, int tamano, int complejidad) {
        if (complejidad == 1) {
            g.fillRect(x, y, tamano, tamano);
            return;
        }

        int newTamano = tamano / 3;
        int newComplejidad = complejidad - 1;

        dibujarAlfombra(g, x, y, newTamano, newComplejidad);
        dibujarAlfombra(g, x + newTamano, y, newTamano, newComplejidad);
        dibujarAlfombra(g, x + 2 * newTamano, y, newTamano, newComplejidad);
        dibujarAlfombra(g, x, y + newTamano, newTamano, newComplejidad);
        dibujarAlfombra(g, x + 2 * newTamano, y + newTamano, newTamano, newComplejidad);
        dibujarAlfombra(g, x, y + 2 * newTamano, newTamano, newComplejidad);
        dibujarAlfombra(g, x + newTamano, y + 2 * newTamano, newTamano, newComplejidad);
        dibujarAlfombra(g, x + 2 * newTamano, y + 2 * newTamano, newTamano, newComplejidad);
    }
}
