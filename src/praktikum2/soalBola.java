/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/**
 *
 * @author WINDOWS 10
 */
public class soalBola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //deklarasi
        double jarijari = 14;
        //objek
        Bola bola = new Bola (10);       
        //memanggil method dari class Bola
        bola.showDiameter();
        bola.showLuasPermukaan();
        bola.showVolume();
        
        bola.setJarijari(jarijari);
        bola.showDiameter();
        bola.showLuasPermukaan();
        bola.showVolume();
    }   
}

