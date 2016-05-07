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
public class Seletor extends GameCanvas  {
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
    
    private int direcao;
    private int pxAndados=0;
    
    private String monumento;
    private String texto;
    
    public Seletor(){
        super(true);
        lm = new LayerManager();
        design = new NoiaGameDesign();
        
        
        try {
           
            design.updateLayerManagerForBackground(lm);
            
            fases[0]= new Fases(design.getMenuSelecionador(), design, 0);
            lm.insert(fases[0], 0);
            fases[1]= new Fases(design.getMenuSelecionador(), design, 1);
            lm.insert(fases[1], 0);
            fases[2]= new Fases(design.getMenuSelecionador(), design, 2);
            lm.insert(fases[2], 0);
            
            box = new Sprite(design.getBox());
            box.setFrameSequence(design.BoxSpriteseq001);
            box.setPosition(0, 240);
            lm.insert(box, 0);
            
            setas = new Sprite(design.getElementosGraficos());
            setas.setFrameSequence(design.cursores);
            setas.setPosition(100, 0);
            lm.insert(setas, 0);
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        g = getGraphics();
    }
    
    
    
    public int start(){
        while(!sairdoMenu){
           this.textos(); 
           if(!this.emMovimento){ 
              this.movimentoCursorMenu();
           }
            this.movimentaCenario();
            
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            
            lm.paint(g, 0, 0);
            this.draw(g);
            flushGraphics();
        }
        return this.menuSelecionado;
    }
    
    
     private void draw(Graphics g) {
        g.setColor(255, 255, 255);
        g.drawString(this.monumento, 7, 250, g.TOP | g.LEFT);
        g.drawString(this.texto, 7, 270, g.TOP | g.LEFT);   
    }
    
    private void movimentaCenario(){
        System.out.println(this.menuSelecionado);
        if(this.emMovimento){
            switch(this.direcao){
                case UP:
                    if(this.pxAndados<fases[0].getHeight()){
                        fases[0].move(0,+15);
                        fases[1].move(0,+15);
                        fases[2].move(0,+15);
                        this.pxAndados+=15;
                    }else{
                        this.pxAndados=0;
                        this.emMovimento=false;
                    }
                    
                    
                    break;
                case DOWN:
                    
                     if(this.pxAndados<fases[0].getHeight()){
                        fases[0].move(0,-15);
                        fases[1].move(0,-15);
                        fases[2].move(0,-15);
                        this.pxAndados+=15;
                    }else{
                        this.pxAndados=0;
                        this.emMovimento=false;
                    }
                    
                    break;
            }
         }
    }
    
    
    private void movimentoCursorMenu(){
        
        int teclaPressionada = getKeyStates();
        if ((teclaPressionada & FIRE_PRESSED) != 0) {
           this.sairdoMenu=true;
            
        }
        if ((teclaPressionada & UP_PRESSED) != 0) {
            if(this.menuSelecionado>0){
                if(!this.emMovimento){
                    this.menuSelecionado--;
                    this.direcao=UP;
                    this.emMovimento=true;
                   
                }
            }
        }
        if ((teclaPressionada & DOWN_PRESSED) != 0) {
            if(this.menuSelecionado<2){
                if(!this.emMovimento){
                    this.menuSelecionado++;
                    this.direcao=DOWN;
                    this.emMovimento=true;
                }
            }
        } 
    }
    
   
    private void textos(){
        switch(this.menuSelecionado){
            case 0:
                this.monumento="   Centro Histórico de Hamburgo Velho";
                this.texto="   Patrimônio histórico arquitetônico";
                break;
            case 1:
                this.monumento="             Santuário das mães";
                this.texto="   Local sagrado para peregrinações";
                break;
            case 2:
                this.monumento="           Monumento ao Sapateiro";
                this.texto="Homenagem aos operários da Indústria";
                break;
        }
    }
    
       
        
   
}
