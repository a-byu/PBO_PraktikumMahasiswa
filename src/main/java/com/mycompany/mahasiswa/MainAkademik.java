/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mahasiswa;

/**
 *
 * @author Buer
 */
public class MainAkademik {
    public static void main(String[] args) {
        
        Mahasiswa mhs1 = new Mahasiswa("123654", "Jujur Junaid", 20, 3.45);
        Mahasiswa mhs2 = new Mahasiswa("123655", "Baik Beckham", 20, 3.77);
        
        mhs1.tampilkanDATA();
        System.out.println("-----------------------------------");
        mhs2.tampilkanDATA();
        System.out.println("-----------------------------------");
        
        mhs1.hitungIPKsemester(3.66);
        mhs2.hitungIPKsemester(3.80, 4);
        System.out.println("-----------------------------------");
        System.out.println("Update Data: " + mhs2.nama + "(" + mhs2.nim + "). SKS: " + mhs2.sks);
        System.out.println("-----------------------------------");
        System.out.println("Penilaian Akhir Semester:");
        System.out.println("-----------------------------------");
        mhs1.tampilkanDATA();
        System.out.println("-----------------------------------");
        mhs2.tampilkanDATA();
        System.out.println("-----------------------------------");
    }
}
