/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.prueba;

import java.util.Scanner;

/**
 *
 * @author DAM107
 */
public class EjercicioPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int o;
        do{
        System.out.println("Elige a que quieres pasar");
        System.out.println("1- ºc a K");
        System.out.println("2- K a ºc");
        int menu =teclado.nextInt();
        switch (menu){
            case 1:
                    System.out.println("introduce los ºc");
                    int ºc=teclado.nextInt();
                    int t1=ºc+273;
                    System.out.println(ºc+" a kelvin serian"+t1);
                    break;
            case 2:
                    System.out.println("introduce los ºc");
                    int k=teclado.nextInt();
                    int t2=k-273;
                    System.out.println(k+" a kelvin serian"+t2);
                    break;
        }
        System.out.println("¿Repetir? 1- Si 2- No");
        o =teclado.nextInt();
    }while(o == 1);
    
}
}