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
public class Arboles {
   private int mCoe[][] = new int [51][51];
   private int mAdya[][] = new int [51][51];
   private int cordeX [] = new int [51];
   private int cordeY [] = new int [51];
   private int nombre [] = new int [51];
   private int Arbol [];
   

    public int getmCoe(int i, int j ) {
        return mCoe[i][j];
    }

    public int getmAdya(int i,int j) {
        return mAdya[i][j];
    }

    public int getCordeX(int i) {
        return cordeX[i];
    }

    public int getCordeY(int i) {
        return cordeY[i];
    }

    public int getNombre(int i) {
        return nombre[i];
    }

    public int getEnArbol(int i) {
        return Arbol[i];
    }

    public void setmCoe(int i,int j ,int mCoeficiente) {
        this.mCoe[i][j] = mCoeficiente;
    }

    public void setmAdya(int i,int j ,int mAdyacencia) {
        this.mAdya[i][j] = mAdyacencia;
    }

    public void setCordeX(int i,int cordeX) {
        this.cordeX[i] = cordeX;
    }

    public void setCordeY(int i, int cordeY) {
        this.cordeY[i] = cordeY;
    }

    public void setNombre(int i,int nombre) {
        this.nombre[i] = nombre;
    }

    public void setArbol(int i,int Arbol) {
        this.Arbol[i] = Arbol;
    }
    public void crearArbol(int i){
       Arbol = new int [i]; 
    }  
    
}
