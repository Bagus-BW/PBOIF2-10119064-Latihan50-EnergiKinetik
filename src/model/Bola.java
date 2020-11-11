/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk menghitung energi kinetik
 * dan usaha dari sebuah bola baseball yang dilempar
 */
public class Bola {
    private double massa;
    private int kecepatan;
    
    public Bola(double massa, int kecepatan){
        this.massa = massa;
        this.kecepatan = kecepatan;
    }

    public double getMassa() {
        return massa;
    }

    public int getKecepatan() {
        return kecepatan;
    }
    
    private double convertGramToKg(double massa){
        return massa/1000;
    }
    
    private double hitungEnergiKinetik(double massa, int kecepatan){
        return 0.5 * (convertGramToKg(massa) * Math.pow(kecepatan, 2));
    }
    
    private double hitungUsaha(double massa, int kecepatan){
        double ekAwal = 0;
        double ekAkhir = hitungEnergiKinetik(massa, kecepatan);
        
        return (ekAkhir - ekAwal);
    }
    
    public void tampil(double massa, int kecepatan){
        System.out.println("=====Program Hitung Energi Kinetik dan Usaha=====");
        System.out.println("Massa : " + massa);
        System.out.println("Kecepatan : " + kecepatan);
        System.out.println();
        System.out.printf("Energi Kinetik : %.3f joule \n",  hitungEnergiKinetik(massa, kecepatan));
        System.out.printf("Usaha : %.3f joule \n", hitungUsaha(massa, kecepatan));
    }
}
