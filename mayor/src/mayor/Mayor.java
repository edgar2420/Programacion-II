/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayor;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 80-18
 */
public class Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura = new Scanner(System.in);
        int[]lista = new int[5];
        for (int i = 0; i < lista.length-1; i++) {
            lista[i]=lectura.nextInt();
        }
        Arrays.sort(lista);
        System.out.println(lista[lista.length-1]);
    }
    
}
