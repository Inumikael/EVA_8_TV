/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_8_tv;

/**
 *
 * @author invitado
 */
public class EVA_8_TV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ELEMENTOS IMPORTANTES DE UNA TELEVISIÓN
        //VOLUMEN (INT)
        //CANAL (INT)
        //PRENDERLA Y APAGARLA (estaEncendido = True esta Apagado = false (TIPO DE DATOS BOOLEAN TRUE PRENDIDA FALSE APAGADA)
        //Constructor
        Television tv = new Television();
        tv.subirVolumen();
        tv.subirCanal();
        tv.power();
        tv.imprimirConfig();
    }
    
}
