/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Noia;

import classes.Cursor;
import classes.Gomo;
import classes.StaticData;
import java.io.IOException;
import java.util.Random;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.game.GameCanvas;
import javax.microedition.lcdui.game.LayerManager;
import javax.microedition.lcdui.game.Sprite;

/**
 *
 * @author caina
 */
public class Mosaico1 extends GameCanvas {

    LayerManager lm;
    NoiaGameDesign design;
    Graphics g;
    boolean jogoRodando = true;
    private Cursor cursor;
    private Gomo gomo;
    private Gomo[][] gomos = new Gomo[3][4];
    private StaticData data;
    private int[][] posicoes = new int[3][3];
    public int retornoDoJogo = 1;
    public int faseSelecionada;
    int posXbranco = 2;
    int posYbranco = 3;
    
    private int sleepTime = 0;
    private int showTime=0;
    
    public Random random;
    private int numeroVezesEmbaralhado=0;
    private boolean embaralhado=false;
    private boolean venceu = false;
    
    private Sprite grade;
    private int movimentos=0;
    private int pecasCertas=0;
    private String tempo=" ";
    private String acertos=" ";
    
    public Mosaico1(int fase) {
        super(true);

        
        data = data.instance();
        this.faseSelecionada = fase;
        lm = new LayerManager();
        design = new NoiaGameDesign();
        try {

            int i = 0;
            for (int y = 0; y <= 3; y++) {
                for (int x = 0; x <= 2; x++) {
                    if (i <= 10) {
                        gomo = new Gomo(design.getFaseSprites(), design, x, y,this.faseSelecionada);
                        lm.insert(gomo, 0);
                        this.gomos[x][y] = gomo;
                    }
                    i++;
                }
            }
            
            grade = new Sprite(design.getElementosGraficos());
            grade.setFrameSequence(design.Grade);
            grade.setPosition(0, 0);
            lm.insert(grade, 0);
            
            cursor = new Cursor(design.getCursorSprite(), design,1);
            lm.insert(cursor, 0);
            design.updateLayerManagerForBackground(lm);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        g = getGraphics();
    }

//BUSCA OS PEDACOS DA MATRIS E ORGANIZA
    private void embaralhaGomos(int x, int y) {
       this.numeroVezesEmbaralhado++; 
        if(this.numeroVezesEmbaralhado>1000){
           this.sleepTime=130;
            this.embaralhado=true;
        }
       this.verificaMatris(x, y);
      
    }
    //FUNCAO PRINCIPAL DO CONTROLADOR DO JOGO
    public int start() {
       random = new Random();
       int contadorHelper=0;
        while (jogoRodando) {
           
           if(contadorHelper>showTime){
                if(this.embaralhado){
                    this.FTWverification();
                    this.acertos=this.pecasCertas+" Certas";
                    this.tempo=(this.pecasCertas+this.movimentos)+" Pontos";
                    trataComandos(); 
                }
                if(!this.embaralhado){
                    this.acertos="Embaralhando";
                    this.tempo="Embaralhando";
                    this.embaralhaGomos(random.nextInt(3), random.nextInt(4));
                }
                if(this.venceu){
                    this.jogoRodando=false;
                }
           }else{
               this.tempo="Parabéns!";
               this.acertos="Você completou o monumento!";
             contadorHelper++;
               System.out.println("Contando:"+contadorHelper);
              
           }
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            
            
            draw(g, sleepTime);
        }
        return 7;
    }

    private void draw(Graphics g, int tempo) {
        lm.paint(g, 0, 0);
        g.setColor(255, 255, 255);
        
        g.drawString(this.tempo, 35, 255, g.TOP | g.LEFT);
        g.drawString(this.acertos, 150, 255, g.TOP | g.LEFT);
        if(this.embaralhado){
            g.drawString("Tecle 1 para voltar ao menu", 10, 275, g.TOP | g.LEFT);
        }else{
            g.drawString("Embaralhando as peças", 10, 275, g.TOP | g.LEFT);
        }
            
        
        flushGraphics();
    }

    
 //POSICIONA OS PEDACOS NA TELA   
    public void verificaMatris(int x, int y) {
        if (y == posYbranco) {
            if ((x - 1) >= 0 || (x + 1) < 3) {
                if (((x + 1) == posXbranco) || ((x - 1) == posXbranco)) {
                        gomos[x][y].setGomoPosition(posXbranco, y);
                        gomos[posXbranco][y] = gomos[x][y];
                        gomos[x][y] = null;
                        posXbranco = x;
                }
            } 
        }else if( x == posXbranco){
             if ((y - 1) >= 0 || (y + 1) < 3) {
                 if (((y + 1) == posYbranco) || ((y - 1) == posYbranco)) {
                     gomos[x][y].setGomoPosition(x, posYbranco);
                     gomos[x][posYbranco]=gomos[x][y];
                     gomos[x][y] = null;
                     posYbranco=y;
                 }
             }
        }
    }
    
    //METODO FORTHEWIN! VERIFICA SE O MALDITO GANHOU
    public void FTWverification(){
    int pecasCertas=0;
        for (int y = 0; y <= 3; y++) {
                for (int x = 0; x <= 2; x++) {
                    //posicao em branca nao conta
                    if(gomos[x][y]!=null){
                        if(gomos[x][y].verificaPosicao(x, y)){
                            System.out.println("Mais uma peca no seu devido lugar");
                            pecasCertas++;
                        }   
                    }
                }
            }
        this.pecasCertas=pecasCertas;
        if(pecasCertas>10){
            this.showTime=120;
            this.venceu = true;
        }
    }
   
        
    

    public void trataComandos() {
        int teclaPressionada = getKeyStates();
       
        if ((teclaPressionada & FIRE_PRESSED) != 0) {
            this.verificaMatris(cursor.x, cursor.y);
            this.FTWverification();
            this.movimentos++;
        }

        if ((teclaPressionada & LEFT_PRESSED) != 0) {
            cursor.move(LEFT);
            this.movimentos++;
        }
        if ((teclaPressionada & RIGHT_PRESSED) != 0) {
            cursor.move(RIGHT);
            this.movimentos++;
        }

        if ((teclaPressionada & UP_PRESSED) != 0) {
            cursor.move(UP);
            this.movimentos++;
        }
        if ((teclaPressionada & DOWN_PRESSED) != 0) {
            cursor.move(DOWN);
            this.movimentos++;
        }
        
        //para o jog
        if((teclaPressionada & GAME_A_PRESSED) != 0){
             this.retornoDoJogo=0;
             this.jogoRodando=false;
        }
        cursor.nextFrame();
    }
}
