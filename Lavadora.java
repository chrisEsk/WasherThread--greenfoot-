import greenfoot.*;

public class Lavadora extends Actor
{
   
    public void act()
    {
        lavarRopa();
    }

    public void lavarRopa() {
        int cantRopa;
        Canasta canasta = (Canasta)getOneObjectAtOffset(0,0,Canasta.class);
        if(canasta != null){
            if(canasta.getCantRopa()>0){
                cantRopa=canasta.getCantRopa();
                new Temporizador(cantRopa, this, (MundoLavadora)getWorld());
                canasta.setCantRopa(0);
            }
        }
    }
}
