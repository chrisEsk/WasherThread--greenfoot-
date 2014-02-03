import greenfoot.*;  

public class Canasta extends Actor
{
    private int cantRopa=0;
    public void act() 
    {
        recogerRopaSucia();
        cambiarDireccionA();
    }

    public int getCantRopa(){
        return cantRopa;
    }

    public void setCantRopa(int pCant){
        cantRopa=pCant;
    }

    public void cambiarDireccion(){
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-1,getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+1,getY());
        }
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-1);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+1);
        }
    }

    public void cambiarDireccionA(){
        if(Greenfoot.getRandomNumber(100)<5){
            if(Greenfoot.getRandomNumber(2)==0){
                setLocation(getX()+(Greenfoot.getRandomNumber(3)-1),getY());
            }else{
                setLocation(getX(),getY()+(Greenfoot.getRandomNumber(3)-1));
            }
        }
    } 

    public void recogerRopaSucia(){
        Actor ropaSucia;
        ropaSucia = getOneObjectAtOffset(0,0,RopaSucia.class);
        if(ropaSucia != null){
            World world;
            world=getWorld();
            world.removeObject(ropaSucia);
            setCantRopa(getCantRopa()+1);
        }
    }
}
