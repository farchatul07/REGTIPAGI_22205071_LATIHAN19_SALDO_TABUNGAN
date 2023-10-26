/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan19;

/**
 *
 * @author user
 */
public class Latihan19 {

    public static void main(String[] args) {
        double saldoAwal = 2500000;
        double bungaBulan = 15;
        int lamaBulan = 6;

        // Hitung bunga per bulan
        double bungaPerBulan = saldoAwal * bungaBulan / 100;

        // Hitung saldo akhir setiap bulan
        double saldoAkhir = saldoAwal;
        for (int i = 1; i <= lamaBulan; i++) {
            saldoAkhir += bungaPerBulan;
            System.out.println("Saldo di bulan ke-" + i + " Rp." + saldoAkhir);
        }
    }
}