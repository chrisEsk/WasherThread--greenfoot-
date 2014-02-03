import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;

public class Temporizador extends Thread
{
    private int tiempo;
    private int tiempoRes;
    private Lavadora lav;
    private MundoLavadora world;

    public Temporizador(int pCantRopa,Lavadora plav, MundoLavadora pWorld){
        setTiempo(pCantRopa);
        setLav(plav);
        setMundo(pWorld);
        start();
    }

    public void setTiempo(int pTiempo){
        tiempo=pTiempo;
        setTiempoRes(pTiempo);
    }

    public void setTiempoRes(int pTiempoRes) {
        tiempoRes = pTiempoRes;
    }    

    public void setLav(Lavadora pLav) {
        lav = pLav;
    }

    public void setMundo(MundoLavadora pWorld) {
        world = pWorld;
    }

    public MundoLavadora getMundo(){
        return world;
    }    

    public int getTiempo(){
        return tiempo;
    }    

    public Lavadora getLav(){
        return lav;
    }

    public int getTiempoRes() {
        return tiempoRes;
    }

    public void run(){
        int i=0;
        while(i<tiempo){              
            lav.setImage("lavadora_min1.png");
            try {
                sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lav.setImage("lavadora_min.png");
            try {
                sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lav.setImage("lavadora_min1.png");
            try {
                sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lav.setImage("lavadora_min.png");
            try {
                sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
            tiempoRes--;
        }
        world.ropaLavada(tiempo);
        JOptionPane.showMessageDialog(null, "Se lavo la ropa");

    }
}

