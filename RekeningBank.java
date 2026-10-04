/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rekeningbank;

/**
 *
 * @author Buer
 */
public class RekeningBank {

    private String noRekening;
    private String namaPemilik;
    private double saldo;
    
    public static int totalRekening = 0;
    
    public RekeningBank(String noRekening, String namaPemilik, double saldoAwal) {
        this.noRekening = noRekening;
        this.namaPemilik = namaPemilik;
        
        if (saldoAwal >= 50000) this.saldo = saldoAwal;
        else {System.out.println("ERROR: Saldo awal minimal Rp. 50.000 bos!"); this.saldo = 0;}
        
        totalRekening++;
    }
    
    public String getNamaPemilik() {
        return this.namaPemilik;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(double jumlah) {
        if (jumlah >= 0) {
            this.saldo = jumlah;
        } else {
            System.out.println("ERROR: Saldo gak boleh minus ya beb");
        }
    }
    
    public void transfer(double nominal, RekeningBank tujuan) {
        if (nominal > this.saldo) {
            System.out.println("ERROR: MONEY NOT FOUND!!!");
        } else {
            this.saldo = this.saldo - nominal;
            tujuan.saldo = tujuan.saldo + nominal;
            System.out.println("Transfer ke rekening " + tujuan.noRekening + " a.n " + tujuan.namaPemilik + " sebesar Rp." + nominal + " sukses!");
        }
    }
}
