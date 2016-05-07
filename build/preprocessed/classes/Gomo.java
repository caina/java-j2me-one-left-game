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
public class Gomo extends Sprite {
    
   public NoiaGameDesign design;
   public int[] posicao = new int[2];
   private int[] posicaoAtual = new int[2];
   public int gomoLargura=60;
   public int gomoAltura=80;
   private int faseSelecionada;
   
    
   public Gomo(Sprite sprite,NoiaGameDesign design,int x,int y,int faseSelecionada){
       super(sprite);
       
       this.faseSelecionada = faseSelecionada;
       this.design = design;
       posicao[0]=x;
       posicao[1]=y;
       this.setGomoPosition(x, y);
       this.setVisible(true);
       this.getSpriteFase1(x, y);
   }
   
   //SETA A POSICAO DO GOMO NO MOSAICO E SALVA A POSICAO DA MATRIS
   public void setGomoPosition(int x, int y){
      this.posicaoAtual[0]=x;
      this.posicaoAtual[1]=y;
      this.setPosition( x*gomoAltura,y*gomoLargura);
   }
   
   public boolean verificaPosicao(int x, int y){
       if((this.posicao[0]==x) && (this.posicao[1]==y)){
           return true;
       }
       return false;
   }
  
   
   
   
   //GAMBIARRA PARA PEGAR OS PEDACOS DO GAME DESIGN DA FASE 1
   private void getSpriteFase1(int x, int y){
      switch(this.faseSelecionada){
          case 0:
                  if(y==0){
                       if(x==0){
                           this.setFrameSequence(design.fase1_11); 
                       }else if(x==1){
                           this.setFrameSequence(design.fase1_12); 
                       }else if(x==2){
                           this.setFrameSequence(design.fase1_13); 
                       }   
                  }else if(y==1){
                      if(x==0){
                           this.setFrameSequence(design.fase1_21); 
                       }else if(x==1){
                           this.setFrameSequence(design.fase1_22); 
                       }else if(x==2){
                           this.setFrameSequence(design.fase1_23); 
                       }
                  }else if(y==2){
                      if(x==0){
                           this.setFrameSequence(design.fase1_31); 
                       }else if(x==1){
                           this.setFrameSequence(design.fase1_32); 
                       }else if(x==2){
                           this.setFrameSequence(design.fase1_33); 
                       }
                  }else if(y==3){
                      if(x==0){
                           this.setFrameSequence(design.fase1_41); 
                       }else if(x==1){
                           this.setFrameSequence(design.fase1_42); 
                       }else if(x==2){
                           this.setFrameSequence(design.fase1_43); 
                       }
                  }
              break;
          case 1:
                if(y==0){
                       if(x==0){
                           this.setFrameSequence(design.fase2_11); 
                       }else if(x==1){
                           this.setFrameSequence(design.fase2_12); 
                       }else if(x==2){
                           this.setFrameSequence(design.fase2_13); 
                       }   
                  }else if(y==1){
                      if(x==0){
                           this.setFrameSequence(design.fase2_21); 
                       }else if(x==1){
                           this.setFrameSequence(design.fase2_22); 
                       }else if(x==2){
                           this.setFrameSequence(design.fase2_23); 
                       }
                  }else if(y==2){
                      if(x==0){
                           this.setFrameSequence(design.fase2_31); 
                       }else if(x==1){
                           this.setFrameSequence(design.fase2_32); 
                       }else if(x==2){
                           this.setFrameSequence(design.fase2_33); 
                       }
                  }else if(y==3){
                      if(x==0){
                           this.setFrameSequence(design.fase2_41); 
                       }else if(x==1){
                           this.setFrameSequence(design.fase2_42); 
                       }else if(x==2){
                           this.setFrameSequence(design.fase2_43); 
                       }
                  }
              
              break;
          case 2:
                   if(y==0){
                       if(x==0){
                           this.setFrameSequence(design.fase3_11); 
                       }else if(x==1){
                           this.setFrameSequence(design.fase3_12); 
                       }else if(x==2){
                           this.setFrameSequence(design.fase3_13); 
                       }   
                  }else if(y==1){
                      if(x==0){
                           this.setFrameSequence(design.fase3_21); 
                       }else if(x==1){
                           this.setFrameSequence(design.fase3_22); 
                       }else if(x==2){
                           this.setFrameSequence(design.fase3_23); 
                       }
                  }else if(y==2){
                      if(x==0){
                           this.setFrameSequence(design.fase3_31); 
                       }else if(x==1){
                           this.setFrameSequence(design.fase3_32); 
                       }else if(x==2){
                           this.setFrameSequence(design.fase3_33); 
                       }
                  }else if(y==3){
                      if(x==0){
                           this.setFrameSequence(design.fase3_41); 
                       }else if(x==1){
                           this.setFrameSequence(design.fase3_42); 
                       }else if(x==2){
                           this.setFrameSequence(design.fase3_43); 
                       }
                  }
              
              break;
       }
       
       
       
     
   }
}
