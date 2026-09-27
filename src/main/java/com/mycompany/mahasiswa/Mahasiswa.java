/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mahasiswa;

/**
 *
 * @author Buer
 */
public class Mahasiswa {

    public String nim;
    public String nama;
    public int sks;
    public double ipk;
    
    public Mahasiswa(String nim, String nama, int sks, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.sks = sks;
        this.ipk = ipk;
    }
    
    public void hitungIPKsemester(double nilaiAkhir) {
        this.ipk = (this.ipk + nilaiAkhir) / 2;
    }
    
    public void hitungIPKsemester(double nilaiAkhir, int bobotSKS) {
        this.ipk = ((this.ipk * this.sks) + (nilaiAkhir * bobotSKS)) / (sks + bobotSKS);
        this.sks = this.sks + bobotSKS;
    }
    
    public void tampilkanDATA() {
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("SKS     : " + sks);
        System.out.println("IPK     : " + ipk);
    }
}