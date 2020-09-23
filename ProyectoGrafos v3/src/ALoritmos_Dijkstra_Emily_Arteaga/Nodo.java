/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ALoritmos_Dijkstra_Emily_Arteaga;

/**
 *
 * @author Emily Arteaga
 */
public class Nodo {    
   private  int n ; // nombre nodo 
   private boolean visit ; // si es visitado 
   private boolean etiq; // 
   private int valor; // lleva el valor de cada nodo
   private Nodo anterior; // nodo anterior
   
   public Nodo(){
       this.n = -1;
       this.visit = false;
       this.etiq = false;
       this.anterior  = null;
       this.valor =0;       
   }

     public int getN() {
        return n;
    }

    public boolean esVisit() {
        return visit;
    }

    public boolean esEtiq() {
        return etiq;
    }

    public int getValor() {
        return valor;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setVisit(boolean visit) {
        this.visit = visit;
    }

    public void setEtiq(boolean etiq) {
        this.etiq = etiq;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    
}
