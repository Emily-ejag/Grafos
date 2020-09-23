/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ALoritmos_Dijkstra_Emily_Arteaga;


import static Ventanas.VentanaPrincipal.jPanel1;
import static Ventanas.VentanaPrincipal.R_repaint;
import static Ventanas.VentanaPrincipal.ingresarNodoOrigen;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Emily Arteaga
 */
public class Dijkstra {
   private  Arboles arboles;
   private int subTope;
   private Nodo auxi=null;
   private int auxAumulado; // es un acumulado auxiliar
   private int subAcomulado;
   private Nodo nodo[]; 
   private int tope;
   private int permanente;     
   private int nodoFin; 
   
   
    public Dijkstra (Arboles arboles, int tope,int permanente, int nodoFin){
        this.arboles = arboles;        
        this.tope = tope;
        this.nodo= new Nodo[tope]; 
        this.permanente = permanente;
        this.nodoFin = nodoFin;
        
    }

    public int getValor(){
        return nodo[nodoFin].getValor(); 
    }
        
    public void dijkstra(){ 
         for (int i = 0; i < tope; i++)  
                    nodo[i]= new Nodo(); 
         
        if(permanente != nodoFin){
             jPanel1.paint(jPanel1.getGraphics());
             R_repaint(tope, arboles);   
             Pintar.clickNodo(jPanel1.getGraphics(), arboles.getCordeX(permanente), arboles.getCordeY(permanente), null); // pinta de color GREEN los nodos
            
        
            nodo[permanente].setVisit(true);        
            nodo[permanente].setN(permanente);       
            
            do{            
              subAcomulado=0;
              auxAumulado = 2000000000; 
              nodo[permanente].setEtiq(true); 
              for (int j = 0; j < tope; j++) {
                  if(arboles.getmAdya(j, permanente)==1){
                        subAcomulado= nodo[permanente].getValor()+arboles.getmCoe(j, permanente);                                 
                        if(subAcomulado <= nodo[j].getValor() && nodo[j].esVisit()==true && nodo[j].esEtiq()== false){
                            nodo[j].setValor(subAcomulado);
                            nodo[j].setVisit(true);
                            nodo[j].setN(j);
                            nodo[j].setAnterior(nodo[permanente]);
                        }
                        else if( nodo[j].esVisit()==false){
                            nodo[j].setValor(subAcomulado); //
                            nodo[j].setVisit(true);
                            nodo[j].setN(j);
                            nodo[j].setAnterior(nodo[permanente]); 
                       }
                 }
              }
              for (int i = 0; i <tope; i++) { 
                if(nodo[i].esVisit()== true && nodo[i].esEtiq()== false){
                   if(nodo[i].getValor()<=auxAumulado){
                       permanente= nodo[i].getN();
                       auxAumulado= nodo[i].getValor();
                   }
                }               
             }
            subTope++;                
          }while(subTope<tope+1);          
          auxi= nodo[nodoFin]; 
           if(auxi.getAnterior() == null )
             JOptionPane.showMessageDialog(null,"No se Pudo LLegar Al Nodo "+nodoFin);          
          while(auxi.getAnterior() != null){           
              Pintar.pintarCamino(jPanel1.getGraphics(), arboles.getCordeX(auxi.getN()), arboles.getCordeY(auxi.getN()), arboles.getCordeX(auxi.getAnterior().getN()), arboles.getCordeY(auxi.getAnterior().getN()));
              Pintar.clickNodo(jPanel1.getGraphics(), arboles.getCordeX(auxi.getN()), arboles.getCordeY(auxi.getN()), null);
             auxi=auxi.getAnterior();              
          }  
         Pintar.clickNodo(jPanel1.getGraphics(), arboles.getCordeX(nodoFin), arboles.getCordeY(nodoFin), null);     
       }
       else Pintar.clickNodo(jPanel1.getGraphics(), arboles.getCordeX(nodoFin), arboles.getCordeY(nodoFin), null);    
    }
    
    
 
}
