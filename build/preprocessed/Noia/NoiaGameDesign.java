/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Noia;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import javax.microedition.lcdui.game.*;
import java.io.IOException;

/**
 * @author caina
 */
public class NoiaGameDesign {
    
    //<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Image teste_menu;
    private Sprite teste_mosaico01;
    public int pedaco_11Delay = 200;
    public int[] pedaco_11 = {0};
    public int pedaco_12Delay = 200;
    public int[] pedaco_12 = {1};
    public int pedaco_13Delay = 200;
    public int[] pedaco_13 = {2};
    public int pedaco_21Delay = 200;
    public int[] pedaco_21 = {3};
    public int pedaco_22Delay = 200;
    public int[] pedaco_22 = {4};
    public int pedaco_23Delay = 200;
    public int[] pedaco_23 = {5};
    public int pedaco_31Delay = 200;
    public int[] pedaco_31 = {6};
    public int pedaco_32Delay = 200;
    public int[] pedaco_32 = {7};
    public int pedaco_33Delay = 200;
    public int[] pedaco_33 = {8};
    public int pedaco_41Delay = 200;
    public int[] pedaco_41 = {9};
    public int pedaco_42Delay = 200;
    public int[] pedaco_42 = {10};
    public int pedaco_43Delay = 200;
    public int[] pedaco_43 = {11};
    private TiledLayer fase;
    private Sprite MenuSelecionador;
    public int fase1Delay = 200;
    public int[] fase1 = {0};
    public int fase2Delay = 200;
    public int[] fase2 = {1};
    public int fase3Delay = 200;
    public int[] fase3 = {2};
    private TiledLayer background_tiled;
    private Image topview_tiles;
    private Sprite vitoriasSprites;
    public int Vitoria3Delay = 200;
    public int[] Vitoria3 = {2};
    public int Vitoria2Delay = 200;
    public int[] Vitoria2 = {1};
    public int Vitoria1Delay = 200;
    public int[] Vitoria1 = {0};
    private Image GRADE;
    private Image Interfaces;
    private Sprite BoxSprite;
    public int BoxSpriteseq001Delay = 200;
    public int[] BoxSpriteseq001 = {0};
    private Image Cursor;
    private Image box;
    private Sprite selecionador;
    public int cursorSequenceDelay = 200;
    public int[] cursorSequence = {0, 1, 2};
    private Image vitorias;
    private Sprite ElementosGraficos;
    public int cursoresDelay = 200;
    public int[] cursores = {1};
    public int GradeDelay = 200;
    public int[] Grade = {0};
    private TiledLayer SistemFace;
    private TiledLayer menuXadrez;
    private Image MENU_1;
    private Sprite CursorSprite;
    public int MenuSequenceDelay = 200;
    public int[] MenuSequence = {4};
    public int GameSequenceDelay = 200;
    public int[] GameSequence = {3, 1, 5};
    private Image Cursor_1;
    private Sprite FaseSprites;
    public int fase2_23Delay = 200;
    public int[] fase2_23 = {17};
    public int fase2_22Delay = 200;
    public int[] fase2_22 = {16};
    public int fase2_32Delay = 200;
    public int[] fase2_32 = {19};
    public int fase2_31Delay = 200;
    public int[] fase2_31 = {18};
    public int fase2_41Delay = 200;
    public int[] fase2_41 = {21};
    public int fase2_33Delay = 200;
    public int[] fase2_33 = {20};
    public int fase2_43Delay = 200;
    public int[] fase2_43 = {23};
    public int fase2_42Delay = 200;
    public int[] fase2_42 = {22};
    public int fase1_41Delay = 200;
    public int[] fase1_41 = {9};
    public int fase1_33Delay = 200;
    public int[] fase1_33 = {8};
    public int fase1_43Delay = 200;
    public int[] fase1_43 = {11};
    public int fase1_42Delay = 200;
    public int[] fase1_42 = {10};
    public int fase2_12Delay = 200;
    public int[] fase2_12 = {13};
    public int fase2_11Delay = 200;
    public int[] fase2_11 = {12};
    public int fase2_21Delay = 200;
    public int[] fase2_21 = {15};
    public int fase2_13Delay = 200;
    public int[] fase2_13 = {14};
    public int fase3_33Delay = 200;
    public int[] fase3_33 = {32};
    public int fase3_41Delay = 200;
    public int[] fase3_41 = {33};
    public int fase3_42Delay = 200;
    public int[] fase3_42 = {34};
    public int fase3_43Delay = 200;
    public int[] fase3_43 = {35};
    public int fase3_11Delay = 200;
    public int[] fase3_11 = {24};
    public int fase3_12Delay = 200;
    public int[] fase3_12 = {25};
    public int fase3_13Delay = 200;
    public int[] fase3_13 = {26};
    public int fase3_21Delay = 200;
    public int[] fase3_21 = {27};
    public int fase3_22Delay = 200;
    public int[] fase3_22 = {28};
    public int fase3_23Delay = 200;
    public int[] fase3_23 = {29};
    public int fase3_31Delay = 200;
    public int[] fase3_31 = {30};
    public int fase3_32Delay = 200;
    public int[] fase3_32 = {31};
    public int fase1_32Delay = 200;
    public int[] fase1_32 = {7};
    public int fase1_31Delay = 200;
    public int[] fase1_31 = {6};
    public int fase1_23Delay = 200;
    public int[] fase1_23 = {5};
    public int fase1_22Delay = 200;
    public int[] fase1_22 = {4};
    public int fase1_21Delay = 200;
    public int[] fase1_21 = {3};
    public int fase1_13Delay = 200;
    public int[] fase1_13 = {2};
    public int fase1_12Delay = 200;
    public int[] fase1_12 = {1};
    public int fase1_11Delay = 200;
    public int[] fase1_11 = {0};
    private Image Fases;
    private Image CRÉDITOS;
    private TiledLayer Creditos;
    //</editor-fold>//GEN-END:|fields|0|
    
    //<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
    //</editor-fold>//GEN-END:|methods|0|

    public Image getTeste_menu() throws java.io.IOException {//GEN-BEGIN:|1-getter|0|1-preInit
        if (teste_menu == null) {//GEN-END:|1-getter|0|1-preInit
            // write pre-init user code here
            teste_menu = Image.createImage("/imagens/teste_menu.png");//GEN-BEGIN:|1-getter|1|1-postInit
        }//GEN-END:|1-getter|1|1-postInit
        // write post-init user code here
        return this.teste_menu;//GEN-BEGIN:|1-getter|2|
    }
//GEN-END:|1-getter|2|

    public Sprite getTeste_mosaico01() throws java.io.IOException {//GEN-BEGIN:|2-getter|0|2-preInit
        if (teste_mosaico01 == null) {//GEN-END:|2-getter|0|2-preInit
            // write pre-init user code here
            teste_mosaico01 = new Sprite(getTeste_menu(), 80, 60);//GEN-BEGIN:|2-getter|1|2-postInit
            teste_mosaico01.setFrameSequence(pedaco_11);//GEN-END:|2-getter|1|2-postInit
            // write post-init user code here
        }//GEN-BEGIN:|2-getter|2|
        return teste_mosaico01;
    }
//GEN-END:|2-getter|2|

    public TiledLayer getFase() throws java.io.IOException {//GEN-BEGIN:|15-getter|0|15-preInit
        if (fase == null) {//GEN-END:|15-getter|0|15-preInit
            // write pre-init user code here
            fase = new TiledLayer(21, 25, getTeste_menu(), 20, 20);//GEN-BEGIN:|15-getter|1|15-midInit
            int[][] tiles = {
                { 0, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144 },
                { 0, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144 },
                { 0, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144 },
                { 0, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144 },
                { 0, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144 },
                { 0, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144 },
                { 0, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144 },
                { 0, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144 },
                { 0, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144 },
                { 0, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144 },
                { 0, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144 },
                { 0, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144 },
                { 0, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144 },
                { 0, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144 },
                { 0, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144 },
                { 0, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144 },
                { 0, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144 },
                { 0, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144 },
                { 0, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144 },
                { 0, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144 },
                { 0, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144 },
                { 0, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144 },
                { 0, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144 },
                { 0, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144, 144 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
            };//GEN-END:|15-getter|1|15-midInit
            // write mid-init user code here
            for (int row = 0; row < 25; row++) {//GEN-BEGIN:|15-getter|2|15-postInit
                for (int col = 0; col < 21; col++) {
                    fase.setCell(col, row, tiles[row][col]);
                }
            }
        }//GEN-END:|15-getter|2|15-postInit
        // write post-init user code here
        return fase;//GEN-BEGIN:|15-getter|3|
    }
//GEN-END:|15-getter|3|

    public void updateLayerManagerForBackground(LayerManager lm) throws java.io.IOException {//GEN-LINE:|16-updateLayerManager|0|16-preUpdate
        // write pre-update user code here
        getSistemFace().setPosition(0, 240);//GEN-BEGIN:|16-updateLayerManager|1|16-postUpdate
        getSistemFace().setVisible(true);
        lm.append(getSistemFace());
        getBackground_tiled().setPosition(0, 0);
        getBackground_tiled().setVisible(true);
        lm.append(getBackground_tiled());//GEN-END:|16-updateLayerManager|1|16-postUpdate
        // write post-update user code here
    }//GEN-BEGIN:|16-updateLayerManager|2|
//GEN-END:|16-updateLayerManager|2|

    public Image getTopview_tiles() throws java.io.IOException {//GEN-BEGIN:|28-getter|0|28-preInit
        if (topview_tiles == null) {//GEN-END:|28-getter|0|28-preInit
            // write pre-init user code here
            topview_tiles = Image.createImage("/imagens/topview_tiles.png");//GEN-BEGIN:|28-getter|1|28-postInit
        }//GEN-END:|28-getter|1|28-postInit
        // write post-init user code here
        return this.topview_tiles;//GEN-BEGIN:|28-getter|2|
    }
//GEN-END:|28-getter|2|

    public TiledLayer getBackground_tiled() throws java.io.IOException {//GEN-BEGIN:|29-getter|0|29-preInit
        if (background_tiled == null) {//GEN-END:|29-getter|0|29-preInit
            // write pre-init user code here
            background_tiled = new TiledLayer(27, 21, getTopview_tiles(), 16, 16);//GEN-BEGIN:|29-getter|1|29-midInit
            int[][] tiles = {
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
            };//GEN-END:|29-getter|1|29-midInit
            // write mid-init user code here
            for (int row = 0; row < 21; row++) {//GEN-BEGIN:|29-getter|2|29-postInit
                for (int col = 0; col < 27; col++) {
                    background_tiled.setCell(col, row, tiles[row][col]);
                }
            }
        }//GEN-END:|29-getter|2|29-postInit
        // write post-init user code here
        return background_tiled;//GEN-BEGIN:|29-getter|3|
    }
//GEN-END:|29-getter|3|

    public Image getCursor() throws java.io.IOException {//GEN-BEGIN:|40-getter|0|40-preInit
        if (Cursor == null) {//GEN-END:|40-getter|0|40-preInit
            // write pre-init user code here
            Cursor = Image.createImage("/imagens/Cursor.png");//GEN-BEGIN:|40-getter|1|40-postInit
        }//GEN-END:|40-getter|1|40-postInit
        // write post-init user code here
        return this.Cursor;//GEN-BEGIN:|40-getter|2|
    }
//GEN-END:|40-getter|2|

    public Sprite getSelecionador() throws java.io.IOException {//GEN-BEGIN:|41-getter|0|41-preInit
        if (selecionador == null) {//GEN-END:|41-getter|0|41-preInit
            // write pre-init user code here
            selecionador = new Sprite(getCursor(), 80, 60);//GEN-BEGIN:|41-getter|1|41-postInit
            selecionador.setFrameSequence(cursorSequence);//GEN-END:|41-getter|1|41-postInit
            // write post-init user code here
        }//GEN-BEGIN:|41-getter|2|
        return selecionador;
    }
//GEN-END:|41-getter|2|

    public Image getInterfaces() throws java.io.IOException {//GEN-BEGIN:|43-getter|0|43-preInit
        if (Interfaces == null) {//GEN-END:|43-getter|0|43-preInit
            // write pre-init user code here
            Interfaces = Image.createImage("/imagens/Interfaces.png");//GEN-BEGIN:|43-getter|1|43-postInit
        }//GEN-END:|43-getter|1|43-postInit
        // write post-init user code here
        return this.Interfaces;//GEN-BEGIN:|43-getter|2|
    }
//GEN-END:|43-getter|2|

    public TiledLayer getSistemFace() throws java.io.IOException {//GEN-BEGIN:|83-getter|0|83-preInit
        if (SistemFace == null) {//GEN-END:|83-getter|0|83-preInit
            // write pre-init user code here
            SistemFace = new TiledLayer(1, 1, getInterfaces(), 240, 51);//GEN-BEGIN:|83-getter|1|83-midInit
            int[][] tiles = {
                { 1 }
            };//GEN-END:|83-getter|1|83-midInit
            // write mid-init user code here
            for (int row = 0; row < 1; row++) {//GEN-BEGIN:|83-getter|2|83-postInit
                for (int col = 0; col < 1; col++) {
                    SistemFace.setCell(col, row, tiles[row][col]);
                }
            }
        }//GEN-END:|83-getter|2|83-postInit
        // write post-init user code here
        return SistemFace;//GEN-BEGIN:|83-getter|3|
    }
//GEN-END:|83-getter|3|

    public Image getMENU_1() throws java.io.IOException {//GEN-BEGIN:|92-getter|0|92-preInit
        if (MENU_1 == null) {//GEN-END:|92-getter|0|92-preInit
            // write pre-init user code here
            MENU_1 = Image.createImage("/imagens/MENU 1.png");//GEN-BEGIN:|92-getter|1|92-postInit
        }//GEN-END:|92-getter|1|92-postInit
        // write post-init user code here
        return this.MENU_1;//GEN-BEGIN:|92-getter|2|
    }
//GEN-END:|92-getter|2|

    public TiledLayer getMenuXadrez() throws java.io.IOException {//GEN-BEGIN:|93-getter|0|93-preInit
        if (menuXadrez == null) {//GEN-END:|93-getter|0|93-preInit
            // write pre-init user code here
            menuXadrez = new TiledLayer(1, 1, getMENU_1(), 240, 304);//GEN-BEGIN:|93-getter|1|93-midInit
            int[][] tiles = {
                { 1 }
            };//GEN-END:|93-getter|1|93-midInit
            // write mid-init user code here
            for (int row = 0; row < 1; row++) {//GEN-BEGIN:|93-getter|2|93-postInit
                for (int col = 0; col < 1; col++) {
                    menuXadrez.setCell(col, row, tiles[row][col]);
                }
            }
        }//GEN-END:|93-getter|2|93-postInit
        // write post-init user code here
        return menuXadrez;//GEN-BEGIN:|93-getter|3|
    }
//GEN-END:|93-getter|3|

    public void updateLayerManagerForMenu(LayerManager lm) throws java.io.IOException {//GEN-LINE:|94-updateLayerManager|0|94-preUpdate
        // write pre-update user code here
        getMenuXadrez().setPosition(0, 0);//GEN-BEGIN:|94-updateLayerManager|1|94-postUpdate
        getMenuXadrez().setVisible(true);
        lm.append(getMenuXadrez());//GEN-END:|94-updateLayerManager|1|94-postUpdate
        // write post-update user code here
    }//GEN-BEGIN:|94-updateLayerManager|2|
//GEN-END:|94-updateLayerManager|2|

    public Image getCursor_1() throws java.io.IOException {//GEN-BEGIN:|99-getter|0|99-preInit
        if (Cursor_1 == null) {//GEN-END:|99-getter|0|99-preInit
            // write pre-init user code here
            Cursor_1 = Image.createImage("/imagens/Cursor_1.png");//GEN-BEGIN:|99-getter|1|99-postInit
        }//GEN-END:|99-getter|1|99-postInit
        // write post-init user code here
        return this.Cursor_1;//GEN-BEGIN:|99-getter|2|
    }
//GEN-END:|99-getter|2|

    public Sprite getCursorSprite() throws java.io.IOException {//GEN-BEGIN:|100-getter|0|100-preInit
        if (CursorSprite == null) {//GEN-END:|100-getter|0|100-preInit
            // write pre-init user code here
            CursorSprite = new Sprite(getCursor_1(), 80, 60);//GEN-BEGIN:|100-getter|1|100-postInit
            CursorSprite.setFrameSequence(GameSequence);//GEN-END:|100-getter|1|100-postInit
            // write post-init user code here
        }//GEN-BEGIN:|100-getter|2|
        return CursorSprite;
    }
//GEN-END:|100-getter|2|

    public Image getFases() throws java.io.IOException {//GEN-BEGIN:|117-getter|0|117-preInit
        if (Fases == null) {//GEN-END:|117-getter|0|117-preInit
            // write pre-init user code here
            Fases = Image.createImage("/imagens/Fases.png");//GEN-BEGIN:|117-getter|1|117-postInit
        }//GEN-END:|117-getter|1|117-postInit
        // write post-init user code here
        return this.Fases;//GEN-BEGIN:|117-getter|2|
    }
//GEN-END:|117-getter|2|



    public Sprite getFaseSprites() throws java.io.IOException {//GEN-BEGIN:|119-getter|0|119-preInit
        if (FaseSprites == null) {//GEN-END:|119-getter|0|119-preInit
            // write pre-init user code here
            FaseSprites = new Sprite(getFases(), 80, 60);//GEN-BEGIN:|119-getter|1|119-postInit
            FaseSprites.setFrameSequence(fase1_11);//GEN-END:|119-getter|1|119-postInit
            // write post-init user code here
        }//GEN-BEGIN:|119-getter|2|
        return FaseSprites;
    }
//GEN-END:|119-getter|2|

    public Sprite getMenuSelecionador() throws java.io.IOException {//GEN-BEGIN:|156-getter|0|156-preInit
        if (MenuSelecionador == null) {//GEN-END:|156-getter|0|156-preInit
            // write pre-init user code here
            MenuSelecionador = new Sprite(getFases(), 240, 240);//GEN-BEGIN:|156-getter|1|156-postInit
            MenuSelecionador.setFrameSequence(fase1);//GEN-END:|156-getter|1|156-postInit
            // write post-init user code here
        }//GEN-BEGIN:|156-getter|2|
        return MenuSelecionador;
    }
//GEN-END:|156-getter|2|

    public Image getBox() throws java.io.IOException {//GEN-BEGIN:|160-getter|0|160-preInit
        if (box == null) {//GEN-END:|160-getter|0|160-preInit
            // write pre-init user code here
            box = Image.createImage("/imagens/box.png");//GEN-BEGIN:|160-getter|1|160-postInit
        }//GEN-END:|160-getter|1|160-postInit
        // write post-init user code here
        return this.box;//GEN-BEGIN:|160-getter|2|
    }
//GEN-END:|160-getter|2|

    public Sprite getBoxSprite() throws java.io.IOException {//GEN-BEGIN:|161-getter|0|161-preInit
        if (BoxSprite == null) {//GEN-END:|161-getter|0|161-preInit
            // write pre-init user code here
            BoxSprite = new Sprite(getBox(), 240, 51);//GEN-BEGIN:|161-getter|1|161-postInit
            BoxSprite.setFrameSequence(BoxSpriteseq001);//GEN-END:|161-getter|1|161-postInit
            // write post-init user code here
        }//GEN-BEGIN:|161-getter|2|
        return BoxSprite;
    }
//GEN-END:|161-getter|2|

    public Image getGRADE() throws java.io.IOException {//GEN-BEGIN:|163-getter|0|163-preInit
        if (GRADE == null) {//GEN-END:|163-getter|0|163-preInit
            // write pre-init user code here
            GRADE = Image.createImage("/imagens/GRADE.png");//GEN-BEGIN:|163-getter|1|163-postInit
        }//GEN-END:|163-getter|1|163-postInit
        // write post-init user code here
        return this.GRADE;//GEN-BEGIN:|163-getter|2|
    }
//GEN-END:|163-getter|2|

    public Sprite getElementosGraficos() throws java.io.IOException {//GEN-BEGIN:|164-getter|0|164-preInit
        if (ElementosGraficos == null) {//GEN-END:|164-getter|0|164-preInit
            // write pre-init user code here
            ElementosGraficos = new Sprite(getGRADE(), 240, 240);//GEN-BEGIN:|164-getter|1|164-postInit
            ElementosGraficos.setFrameSequence(Grade);//GEN-END:|164-getter|1|164-postInit
            // write post-init user code here
        }//GEN-BEGIN:|164-getter|2|
        return ElementosGraficos;
    }
//GEN-END:|164-getter|2|

    public Image getVitorias() throws java.io.IOException {//GEN-BEGIN:|167-getter|0|167-preInit
        if (vitorias == null) {//GEN-END:|167-getter|0|167-preInit
            // write pre-init user code here
            vitorias = Image.createImage("/imagens/vitorias.png");//GEN-BEGIN:|167-getter|1|167-postInit
        }//GEN-END:|167-getter|1|167-postInit
        // write post-init user code here
        return this.vitorias;//GEN-BEGIN:|167-getter|2|
    }
//GEN-END:|167-getter|2|

    public Sprite getVitoriasSprites() throws java.io.IOException {//GEN-BEGIN:|168-getter|0|168-preInit
        if (vitoriasSprites == null) {//GEN-END:|168-getter|0|168-preInit
            // write pre-init user code here
            vitoriasSprites = new Sprite(getVitorias(), 240, 300);//GEN-BEGIN:|168-getter|1|168-postInit
            vitoriasSprites.setFrameSequence(Vitoria1);//GEN-END:|168-getter|1|168-postInit
            // write post-init user code here
        }//GEN-BEGIN:|168-getter|2|
        return vitoriasSprites;
    }
//GEN-END:|168-getter|2|

    public Image getCRÉDITOS() throws java.io.IOException {//GEN-BEGIN:|172-getter|0|172-preInit
        if (CRÉDITOS == null) {//GEN-END:|172-getter|0|172-preInit
            // write pre-init user code here
            CRÉDITOS = Image.createImage("/imagens/CRÉDITOS.png");//GEN-BEGIN:|172-getter|1|172-postInit
        }//GEN-END:|172-getter|1|172-postInit
        // write post-init user code here
        return this.CRÉDITOS;//GEN-BEGIN:|172-getter|2|
    }
//GEN-END:|172-getter|2|

    public TiledLayer getCreditos() throws java.io.IOException {//GEN-BEGIN:|173-getter|0|173-preInit
        if (Creditos == null) {//GEN-END:|173-getter|0|173-preInit
            // write pre-init user code here
            Creditos = new TiledLayer(1, 1, getCRÉDITOS(), 240, 304);//GEN-BEGIN:|173-getter|1|173-midInit
            int[][] tiles = {
                { 1 }
            };//GEN-END:|173-getter|1|173-midInit
            // write mid-init user code here
            for (int row = 0; row < 1; row++) {//GEN-BEGIN:|173-getter|2|173-postInit
                for (int col = 0; col < 1; col++) {
                    Creditos.setCell(col, row, tiles[row][col]);
                }
            }
        }//GEN-END:|173-getter|2|173-postInit
        // write post-init user code here
        return Creditos;//GEN-BEGIN:|173-getter|3|
    }
//GEN-END:|173-getter|3|

    public void updateLayerManagerForCreditosCena(LayerManager lm) throws java.io.IOException {//GEN-LINE:|174-updateLayerManager|0|174-preUpdate
        // write pre-update user code here
        getCreditos().setPosition(0, 0);//GEN-BEGIN:|174-updateLayerManager|1|174-postUpdate
        getCreditos().setVisible(true);
        lm.append(getCreditos());//GEN-END:|174-updateLayerManager|1|174-postUpdate
        // write post-update user code here
    }//GEN-BEGIN:|174-updateLayerManager|2|
//GEN-END:|174-updateLayerManager|2|




    
}
