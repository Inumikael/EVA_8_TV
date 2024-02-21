/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_8_tv;

/**
 *
 * @author Hétor Murguía
 */
public class Television {
    //atributos
    private int volumen;
    private int canal;
    private boolean estaEncendida;
    
    //Constructores:
    //Constructor sin argumentos : Constructor Default
    //Método para inicializar los objetos
    public Television(){
        //No es obligatorio
        volumen = 30;
        canal = 5;
        estaEncendida = false;
    }
    
    
    public void subirVolumen(){
       if(estaEncendida && (volumen < 100))
      
        volumen = volumen + 1;
        //volumen+1;
        //volumen++;
    }
    public void bajarVolumen(){
        if(estaEncendida && (volumen > 0))
        volumen = volumen - 1;
    }    
    public void subirCanal(){
        if(estaEncendida)
        canal = canal + 1;
        
    }
    public void bajarCanal(){
        if(estaEncendida && (canal > 0))
        canal = canal - 1;
    }
    public void cambiarCanal(int noCanal){
        if(estaEncendida && !(noCanal <= 0))
        canal = noCanal;
    }
    public void power(){
       /* if(estaEncendida == true)
            estaEncendida = false;
        else
            estaEncendida = true;*/
        estaEncendida = !estaEncendida;//el signo ! hace negacion en la variable estaEncendida
        //cada vez que presiones power estaras cambiando el valor de la variable estaEncendida
    }
    public void imprimirConfig(){
        System.out.println("Volumen " + volumen);
        System.out.println("canal " + canal);
        System.out.println("Volumen " + estaEncendida);
    }
}
