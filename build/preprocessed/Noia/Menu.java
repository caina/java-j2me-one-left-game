/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Noia;

import classes.Cursor;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.lcdui.game.LayerManager;

/**
 *
 * @author caina
 */
public class Menu extends GameCanvas  {
    LayerManager lm;
    NoiaGameDesign design;
    Graphics g;
    
    private int menuSelecionado = 2;
    
    private boolean sairdoMenu= false;
    private Cursor cursor;
    
    public Menu(){
        super(true);
        lm = new LayerManager();
        design = new NoiaGameDesign();
        
        
        try {
            cursor = new Cursor(design.getCursorSprite(), design,2);
            cursor.setPosition(0, 160);
           
            lm.insert(cursor, 0);
            design.updateLayerManagerForMenu(lm);
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        g = getGraphics();
    }
    
    
    
    public int start(){
        while(!sairdoMenu){
           this.movimentoCursorMenu();
            
            
            try {
                Thread.sleep(150);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            
            lm.paint(g, 0, 0);
            flushGraphics();
        }
        return this.menuSelecionado;
    }
    
    
    
    
    private void movimentoCursorMenu(){
        
        System.out.println("cursor:"+this.menuSelecionado );
        int teclaPressionada = getKeyStates();
        if ((teclaPressionada & FIRE_PRESSED) != 0) {
           if(this.menuSelecionado==1) this.menuSelecionado=7;
           this.sairdoMenu=true;
            
        }
        if ((teclaPressionada & UP_PRESSED) != 0) {
            if(this.menuSelecionado<2){
                this.menuSelecionado++;
                cursor.move(-10, -35);
            }
        }
        if ((teclaPressionada & DOWN_PRESSED) != 0) {
            if(this.menuSelecionado>0){
                this.menuSelecionado--;
                cursor.move(10, 35);
            }
        }
       
        cursor.nextFrame();
    }
    
    
       
        
   
}
