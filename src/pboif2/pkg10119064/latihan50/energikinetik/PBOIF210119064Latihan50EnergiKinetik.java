/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan50.energikinetik;

import model.Bola;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk menghitung energi kinetik
 * dan usaha dari sebuah bola baseball yang dilempar
 */
public class PBOIF210119064Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bola energiKinetik = new Bola(145, 25);
        
        energiKinetik.tampil(energiKinetik.getMassa(), energiKinetik.getKecepatan());
    }
    
}
