/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan_2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 * Belajar class enkapsulasi
 */
class Latihan_2 extends Orang {
    public static void main(String[] args) {
        // variabel input nama dengan tipe data string;
        String input_nama;
        
        // Memanggil fungsi scanner pada java; 
        Scanner input = new Scanner(System.in);
        
        // Memanggil class orang 
        // Untuk dapat menggunakan method/fungsi
        Orang nama = new Orang();
        
        // Memasukan nama 
        System.out.print("Masukkan Nama : ");
        input_nama = input.nextLine();
        
        // Menampilkan nama dengan method/fungsi dari class orang;
        nama.setNama(input_nama);
        System.out.print(nama.getNama());
    }
}
