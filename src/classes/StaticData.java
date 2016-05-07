/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import java.util.Random;

/**
 *
 * @author caina
 */
public class StaticData {
   static private StaticData _instance = null;

   private int maximoSubido;
   private int pontos;
   private int numeroLivros=0;
   private int forcaDeVoo;
   public int poderDeVoo=2;
   public int levelFogo=0;
   public int levelCathItem=0;

   static Random number = new Random();
   protected StaticData() {
   } 

   static public StaticData instance() {
      if(null == _instance) {
         _instance = new StaticData();
      }
      return _instance;
   }

    public int getRandom(int numero){
        return number.nextInt(numero);
    }


    public void setPoderDeVoo(int poder){
        this.poderDeVoo=poder;
    }
    public void setNumeroLivros(int livro){
        this.numeroLivros+=livro;
    }
    public int getLivros(){
        return this.numeroLivros;
    }
    public void setPontos(int pontos){
        this.pontos += pontos;
    }
    public int getPontos(){
        return this.pontos;
    }
    public void setMaximo(int tamanho){
        if(tamanho> this.maximoSubido){
            this.maximoSubido=tamanho;
        }
    }
    public void addFirePower(){
       if(this.levelFogo<=3)
        this.levelFogo++;
    }
    public int getFirePower(){
        return this.levelFogo;
    }

    public void addCatchPower(){
        if(this.levelCathItem<=3)
            this.levelCathItem++;
    }

    public int getlevelCathItem(){
        return this.levelCathItem;
    }
    public void addPontos(){
        this.pontos+=150;
    }
}
