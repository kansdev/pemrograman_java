/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pplg.latihan_1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Latihan_1 {
    
    // Fungsi input 
    static void input_produk() {
        String nama_produk;
        int jumlah_produk, harga_satuan, total_harga;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan Nama Barang : ");
        nama_produk = input.nextLine();
        
        System.out.println("Masukan Jumlah Produk : ");
        jumlah_produk = input.nextInt();
        
        System.out.println("Masukan harga satuan : ");
        harga_satuan = input.nextInt();
        
        total_harga = harga_satuan * jumlah_produk;
        
        cetak_struk(nama_produk, jumlah_produk, harga_satuan, total_harga);
    }
    
    // Fungsi atau method cetak struk
    static void cetak_struk(String produk, int jumlah, int harga_satuan, int total_harga) {
        System.out.println("          Alfarmart STA.Karet ");        
        System.out.println("      PT. Sumber Alfaria Trijaya TBK ");
        System.out.println("   JL. MH Tamrin No.9, Cikokol, Tangerang");
        System.out.println("        NPWP : 01.336.238.9054.000");
        System.out.println("JL. Dukuh Pinggir, No. 11, (STA Tanah Abang)");
        System.out.println("============================================");
        System.out.println("Bon   KC79-805-19060MK9      Kasir : Muti AC");
        System.out.println("============================================");
        System.out.println(""+produk+"           "+jumlah+"     "+harga_satuan+"    "+total_harga);
        System.out.println("--------------------------------------------");
        System.out.println("Total Item  1                           4500");
        System.out.println("Tunai                                   5000");
        System.out.println("Kembalian                               5000");
        System.out.println("PPN (         409");
        System.out.println("============================================");
        System.out.println("Tgl. 19-5-2017      06:51:42      v.2017.4.1");
        System.out.println("--------------------------------------------");
        System.out.println("Kriti Saran : 1500959,       SMS: 0817111234");
    
    }
    
    // Fungsi utama
    public static void main(String[] args) {
        
        input_produk();
        
    }   
    
}