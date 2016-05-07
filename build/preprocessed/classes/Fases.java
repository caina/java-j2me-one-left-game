/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import Noia.NoiaGameDesign;
import javax.microedition.lcdui.game.Sprite;

/**
 *
 * @author caina
 */
public class Fases extends Sprite {
    
    private int fase;
    private NoiaGameDesign design;
    
    public Fases(Sprite sprite,NoiaGameDesign design,int layer){
        super(sprite);
        this.setVisible(true);
        this.design = design;
        this.getLayer(layer);
        this.setMapPosition(layer);
    }
    
    public void setMapPosition(int layer){
        this.setPosition(0, (layer*240));
    }
    
    public void getLayer(int layer){
        if(layer==0){
            this.setFrameSequence(this.design.fase1);
        }else if(layer==1){
            this.setFrameSequence(this.design.fase2);
        }else if(layer==2){
            this.setFrameSequence(this.design.fase3);
        }
        
    }
}
