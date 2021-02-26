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
public class Bola {
    //deklarasi
    private double jarijari;
    
    //konstruktor dan parameter untuk jari - jari
    public Bola(double jarijari){
        this.jarijari = jarijari;
    }
    
    //set jari - jari
    public void setJarijari(double jarijari){
        this.jarijari = jarijari;
    }
    
    //menghitung diameter bola
    public void showDiameter(){
        System.out.println("Diameter = "+(2 * jarijari));
    }
    
    //menghitung luas permukaan bola
    public void showLuasPermukaan(){
        System.out.println("Luas Permukaan = "+(4 * Math.PI * jarijari * jarijari));
    }
    
    //menghitung volume bola
    public void showVolume(){
        System.out.println("Volume = "+(Math.PI * jarijari * jarijari * jarijari * 4/3)+"\n");
    } 
}

