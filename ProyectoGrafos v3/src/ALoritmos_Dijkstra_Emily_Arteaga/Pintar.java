/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ALoritmos_Dijkstra_Emily_Arteaga;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.MONOSPACED;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author Emily_Artaga
 */
public class Pintar {   
    Color c;

    public static void clickNodo(Graphics cir,int posx,int posy,String nodo){
       //((Graphics2D)cir).setColor(Color.RED);
        ((Graphics2D)cir).setStroke(new BasicStroke(4));       
        ((Graphics2D)cir).fillOval(posx, posy, 15, 15);        
        ((Graphics2D)cir).drawOval(posx, posy, 15, 15);
         
    }
    
   public static void pintarNodo(Graphics cir,int posx,int posy,String nodo){
       ((Graphics2D)cir).setColor(Color.PINK);
        ((Graphics2D)cir).setStroke(new BasicStroke(2));        
        ((Graphics2D)cir).fillOval(posx, posy, 30, 30);        
        ((Graphics2D)cir).setColor(Color.BLACK);
        ((Graphics2D)cir).drawOval(posx, posy, 30, 30);
        
        ((Graphics2D)cir).setColor(Color.YELLOW);
        Font fuente=new Font("A New Hope",Font.BOLD, 16);
        cir.setFont(fuente);
        ((Graphics2D)cir).drawString(nodo, posx, posy);
         
    }    
  
  public static void pintarArista(Graphics cir, int posx1,int posy1,int posx2,int posy2,int t){
        int Auxx = 0; int Auxy = 0; 
        ((Graphics2D)cir).setRenderingHint(RenderingHints.KEY_ANTIALIASING,  RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(2);
        ((Graphics2D)cir).setStroke(stroke);         
       ((Graphics2D)cir).drawLine(posx1+10, posy1+10, posx2+10, posy2+10);
       if(posx1<=posx2)
           Auxx=((posx2-posx1)/2)+posx1;       
        if(posx1>posx2)
           Auxx=((posx1-posx2)/2)+posx2;
        if(posy1<posy2)
           Auxy=((posy2-posy1)/2)+posy1;
        if(posy1>=posy2)
            Auxy=((posy1-posy2)/2)+posy2;        
        Font fuente=new Font("A New Hope",Font.PLAIN,20);
        cir.setFont(fuente);
      ((Graphics2D)cir).drawString(String.valueOf(t), Auxx, Auxy);
  }   
  public static void pintarCamino(Graphics cir, int posx1,int posy1,int posx2,int posy2){
      ((Graphics2D)cir).setColor(Color.RED);
      //((Graphics2D)cir).setRenderingHint(RenderingHints.KEY_ANTIALIASING,  RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(5);
        ((Graphics2D)cir).setStroke(stroke);
        cir.drawLine(posx1+10, posy1+10, posx2+10, posy2+10);
  }

}
