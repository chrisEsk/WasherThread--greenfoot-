import greenfoot.*;
import java.util.*;

/*
 * Programa:			Lavadora en Greenfoot
 * Fecha de creacion: 	16 - Junio - 2012
 * Autor(es):			Fabián Vega, Chris Esquivel
 * _ _  _  |` _ _|_ _  _
 *(_(/_| |~|~(_) | (/_(_
 *
 */

public class MundoLavadora extends World
{

    public MundoLavadora() 
    {
        super(10, 10, 60);        
        prepare();
    }

    private void prepare()
    {
        addObject(new Ropa(), 3, 2);
        addObject(new Ropa(), 4, 1);
        addObject(new Ropa(), 7, 7);
        addObject(new Ropa(), 8, 7);
        addObject(new Ropa(), 10, 3);
        addObject(new RopaSucia(), 5, 8);
        addObject(new RopaSucia(), 9, 4);
        addObject(new RopaSucia(), 1, 3);
        addObject(new RopaSucia(), 1, 0);
        addObject(new RopaSucia(), 7, 2);
        addObject(new RopaSucia(), 3, 5);
        addObject(new Canasta(), 0, 9);
        addObject(new Lavadora(), 5, 5);
    }
    
    public void ropaLavada(int pCantRopa){
        int i = 0;
        ArrayList<Ropa> lista=new ArrayList<Ropa>();
        while(i<pCantRopa){
            lista.add(new Ropa());
            addObject(lista.get(i),Greenfoot.getRandomNumber(10), Greenfoot.getRandomNumber(10));
            i++;
        }
    }
}
