/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Noia;

import classes.Cursor;
import classes.Fases;
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.lcdui.game.LayerManager;
import javax.microedition.lcdui.game.Sprite;

/**
 *
 * @author caina
 */
public class Vitoria extends GameCanvas  {
    LayerManager lm;
    NoiaGameDesign design;
    Graphics g;
    
    public int menuSelecionado = 0;
    
    private boolean sairdoMenu= false;
    private Cursor cursor;
    private Fases[] fases = new Fases[3];
    private boolean emMovimento = false;
    
    Sprite box;
    Sprite setas;
    Sprite faseSprite;
    
    public Vitoria(int fase){
        super(true);
        lm = new LayerManager();
        design = new NoiaGameDesign();
        
        
        try {
            
            switch(fase){
                case 0:
                 faseSprite = new Sprite(design.getVitoriasSprites());
                 faseSprite.setFrameSequence(design.Vitoria1);
                 faseSprite.setPosition(0, 0);
                 lm.insert(faseSprite, 0);
                 design.updateLayerManagerForBackground(lm);
                break;
               case 1:
                 faseSprite = new Sprite(design.getVitoriasSprites());
                 faseSprite.setFrameSequence(design.Vitoria2);
                 faseSprite.setPosition(0, 0);
                 lm.insert(faseSprite, 0);
                 design.updateLayerManagerForBackground(lm);
                break;
              case 2:
                 faseSprite = new Sprite(design.getVitoriasSprites());
                 faseSprite.setFrameSequence(design.Vitoria3);
                 faseSprite.setPosition(0, 0);
                 lm.insert(faseSprite, 0);
                 design.updateLayerManagerForBackground(lm);
                break;
              case 3:
                  design.updateLayerManagerForCreditosCena(lm);
                  break;
                            
            }
            
            
           
           
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        g = getGraphics();
    }
    
    
    
    public int start(){
        while(!sairdoMenu){
          
           if(!this.emMovimento){ 
              this.movimentoCursorMenu();
           }
            
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            
            lm.paint(g, 0, 0);
            flushGraphics();
        }
        return 2;
    }
    
    
    private void movimentoCursorMenu(){
        
        int teclaPressionada = getKeyStates();
        if ((teclaPressionada & FIRE_PRESSED) != 0) {
           this.sairdoMenu=true;
            
        }
        
    }
      
   
}
