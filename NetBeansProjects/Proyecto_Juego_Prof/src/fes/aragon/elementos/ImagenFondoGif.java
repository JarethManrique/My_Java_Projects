/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.elementos;

import fes.aragon.interfaz.Acciones;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

/**
 *
 * @author Jareth Manrique
 */
public class ImagenFondoGif implements Acciones{
    private Image imagen = null;
    private Image imagenDos = null;
    private Component componente;
    private int x=-20;
    private static ImagenFondoGif objetoUnico;
    private MediaTracker tracker;
    
    public static ImagenFondoGif getImagenFondoGif(){
        if(objetoUnico==null){
            objetoUnico=new ImagenFondoGif();
        }
        return objetoUnico;
    }
    private ImagenFondoGif(){
        
    }
    public void configuracion(Component componente, String archivo, String personaje){
        this.componente=componente;
        tracker = new MediaTracker(componente);
        Toolkit herram = Toolkit.getDefaultToolkit();
        imagen = herram.getImage(getClass().getResource("/fes/aragon/recursos/"+archivo));
        imagenDos = herram.getImage(getClass().getResource("/fes/aragon/recursos/"+personaje));
        tracker.addImage(imagen, 1);
        tracker.addImage(imagenDos, 2);
        
        try{
            tracker.waitForAll();
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
        
    }

    @Override
    public void pintar(Graphics2D g) {
        g.drawImage(imagen, 0,0, this.componente.getWidth(),this.componente.getHeight(),null);
        g.drawImage(imagenDos, x,230, 50,50,null);
    }

    @Override
    public void teclado(KeyEvent e) {
    }

    @Override
    public void raton(KeyEvent e) {
    }

    @Override
    public void calculo() {
        if(x>this.componente.getWidth()+20){
            x=-20;
        }else {
            x+=4;
        }
    }
    
}
