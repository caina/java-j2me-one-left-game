/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import Noia.NoiaGameDesign;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.lcdui.game.Sprite;

/**
 *
 * @author caina
 */
public class Cursor extends Sprite {
    
   public int gomoLargura=60;
   private int gomoAltura=80;
   public int x=0;
   public int y=0;
   
   private NoiaGameDesign design;
    
    public Cursor (Sprite sprite,NoiaGameDesign design, int tipo){
        super(sprite);
        this.setVisible(true);
        this.design = design;
        this.getSprite(tipo);
        this.setCurosorPosition(y, x);
    }
    
    public void getSprite(int tipo){
        if(tipo==1){
            this.setFrameSequence(this.design.GameSequence);
        }else{
            this.setFrameSequence(this.design.MenuSequence);
        }
    }
    
    public void setCurosorPosition(int x,int y){
        
        this.setPosition( x*gomoAltura,y*gomoLargura);
    }
    
     public void move(int direcao) {
         System.out.println("X em >"+this.x);
         switch (direcao) {
            case GameCanvas.LEFT:
                if(this.x > 0){
                   x--;
                }
              break;

            case GameCanvas.RIGHT:
                if(x<2){
                    x++;
                }   
              break;
            
            case GameCanvas.UP:
                if(y>0){
                    y--;
                }   
              break;
            
            case GameCanvas.DOWN:
                if(y<3){
                    y++;
                }   
              break;       
        }
        
        this.nextFrame(); 
        this.setCurosorPosition(x,y);
    }
    
}
