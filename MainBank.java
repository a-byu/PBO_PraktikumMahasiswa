/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rekeningbank;

/**
 *
 * @author Buer
 */
public class MainBank {
    public static void main(String[] args) {
    
        RekeningBank rek1 = new RekeningBank("13579", "Abdul Aziz", 75000);
        RekeningBank rek2 = new RekeningBank("24680", "Burhan Bachtiar", 130000);
        
        System.out.println("Saldo awal " + rek1.getNamaPemilik() + ": Rp." + rek1.getSaldo());
        System.out.println("Saldo awal " + rek2.getNamaPemilik() + ": Rp." + rek2.getSaldo());
        
        System.out.println("-------------------------------------------------------");
        rek1.setSaldo(100000);
        System.out.println("Saldo " + rek1.getNamaPemilik() + " setelah setSaldo: " + rek1.getSaldo());
        System.out.println("-------------------------------------------------------");
        
        System.out.println("-------------------------------------------------------");
        rek1.transfer(70000, rek2);
        rek1.transfer(10000, rek2);
        rek1.transfer(100000, rek2);
        System.out.println("-------------------------------------------------------");
        
        System.out.println(rek1.getNamaPemilik() + " sisa saldo: " + rek1.getSaldo());
        System.out.println(rek2.getNamaPemilik() + " sisa saldo: " + rek2.getSaldo());
        
        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println("Total Rekening: " + RekeningBank.totalRekening);
    }
}
