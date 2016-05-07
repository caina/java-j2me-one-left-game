/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Noia;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.*;

/**
 * @author caina
 */
public class NoiaMidlet extends MIDlet {

    private Mosaico1 mosaico;
    private Menu menu;
    private Seletor seletor;
    private Vitoria vitoria;
    
    private int faseSelecionada=5;
    
    public int posicaoAtual =1;
    public void startApp() {
       Display d = Display.getDisplay(this);
       
          while(posicaoAtual!=0){

            if(posicaoAtual==1){
                menu = new Menu();
                d.setCurrent(menu);
                posicaoAtual = menu.start();
                if(posicaoAtual==7){
                    this.faseSelecionada=3;
                }
            }
            
            if(posicaoAtual==2){
                seletor = new Seletor();
                d.setCurrent(seletor);
                this.faseSelecionada = seletor.menuSelecionado;
                
                this.faseSelecionada = seletor.start();
                if(this.faseSelecionada!=5){
                    this.posicaoAtual=3;
                }
            }
              
            if(posicaoAtual==3){
                mosaico = new Mosaico1(this.faseSelecionada);
                d.setCurrent(mosaico);
                posicaoAtual = mosaico.start();
            }
            
            if(posicaoAtual==7){
                vitoria = new Vitoria(this.faseSelecionada);
                d.setCurrent(vitoria);
                posicaoAtual = vitoria.start();
            }
   
        }
        
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}
