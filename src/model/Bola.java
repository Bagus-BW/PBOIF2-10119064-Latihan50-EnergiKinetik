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
    private int massa;
    private int kecepatan;
    
    public Bola(int massa, int kecepatan){
        this.massa = massa;
        this.kecepatan = kecepatan;
    }

    public int getMassa() {
        return massa;
    }

    public int getKecepatan() {
        return kecepatan;
    }
    
    private double hitungEnergiKinetik(int massa, int kecepatan){
        return 0.5 * (massa * Math.pow(kecepatan, 2));
    }
    
    private double hitungUsaha(int massa, int kecepatan){
        double ekAwal = 0;
        double ekAkhir = hitungEnergiKinetik(massa, kecepatan);
        
        return (ekAkhir - ekAwal);
    }
    
    public void tampil(int massa, int kecepatan){
        System.out.println("=====Program Hitung Energi Kinetik dan Usaha=====");
        System.out.println("Massa : " + massa);
        System.out.println("Kecepatan : " + kecepatan);
        System.out.println();
        System.out.println("Energi Kinetik : " + hitungEnergiKinetik(massa, kecepatan) + " joule");
        System.out.println("Usaha : " + hitungUsaha(massa, kecepatan) + " joule");
    }
}
