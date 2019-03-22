/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambioscrittura;

/**
 *
 * @author 72873486
 */
public class CambioScrittura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cambio ciao = new Cambio ("ciao ", "C:\\Users\\72873486\\Downloads\\pariBelloi.txt" );
        ciao.toSnake();
        Cambio serio = new Cambio ("serio", "C:\\Users\\72873486\\Downloads\\Bella_ciao.txt");
        serio.toCamel();
    }
    
}
