/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundos;

import java.util.Scanner;

/**
 *
 * @author 80-18
 */
public class Segundos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura = new Scanner(System.in);
        int segundos = lectura.nextInt();
        int horas = 0;
        int minutos = 0;
        while (segundos >= 3600) {
            segundos = segundos - 3600;
            horas++;
        }
        while (segundos >= 60) {
            segundos -= 60;
            minutos++;
        }
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }

}
