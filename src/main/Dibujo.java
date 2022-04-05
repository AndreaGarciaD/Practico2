package main;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Dibujo extends JPanel {

    private ArrayList<Alfombra> lista = new ArrayList<>();
    private Color color = new Color(162, 222, 242);

    public Dibujo(){
        setBackground(color);
    }

    /*public Dibujo(int x, int y, int tamano, int complejidad){
       lista.add(new Alfombra(x,y,tamano,complejidad));
       setBackground(color);
    }*/

    protected void paintComponent(Graphics g){
            super.paintComponent(g);
            for(Alfombra elemento : lista){
                elemento.dibujar(g);
            }
    }

    public void addAlfombra(int x, int y, int tamano, int complejidad){
        lista.add(new Alfombra(x,y,tamano,complejidad));
        repaint();
    }

}
