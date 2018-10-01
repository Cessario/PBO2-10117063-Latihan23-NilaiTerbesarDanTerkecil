/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author DEADPOOL
 */
public class PBO210117063Latihan23NilaiTerbesarDanTerkecil {

    /*Nama : Cessario Sheva Lakita Purwa Adidjaya
        NIM  : 10117063
        Kelas : IF-2
        Deskripsi Program : Menampilkan Nilai Terbesar dan Terkecil
     */
    public static void main(String[] args) {
        String kalimat;
        int BanyakMHS;
        int [] nilai = new int[20];
        int i = 0;
        int j = 1;
        
        System.out.println("====Program Nilai Terbesar dan Terkecil Nilai "
                + "Mahasiswa");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Petugas :");
        kalimat = scanner.nextLine();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa :");
        BanyakMHS = scanner.nextInt();
        
        while (i < BanyakMHS ){
        System.out.print("Masukkan Nilai Mahasiswa ke-" +(i+1)+":" );
        nilai[i] = scanner.nextInt();
        i = i + 1;
    }
        System.out.println("");
        for(i = 0; i < BanyakMHS; i++){
            System.out.println("Hasil Nilai Mahasiswa ke-"+(i+1)+" : "+nilai[i]);
        }
        
        
       int min=nilai[1];
       int max=nilai[1];
       
        for (i = 0; i < BanyakMHS; i++) {
            if(nilai[i]>max)
                max=nilai[i];
            else if (nilai[i]<min)
                min=nilai[i];
        }
        System.out.println("\nNilai terbesar : "+max);
        System.out.println("Nilai terkecil : "+min);
        
    }
}
