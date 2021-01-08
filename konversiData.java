package com.tutorial;

public class Main {

    public static void main(String[] args) {
        // konversi data
        // jika mengkonversi data ke tipe data yg lebuh besar, maka nilai akan tetap
        // dan jika mengkonversi ke yg lebih kecil maka nilai akan berubah

        // konversi ke lebih besar
        int nilaiInt = 458;
        long nilaiLong = nilaiInt;
        System.out.println("nilai long adalah " + nilaiLong);

        // konversi ke lebih kecil
        // maka nilai akan berubah
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("nilai byte adalah " + nilaiByte);

        // casting pembagiam
        int x = 10;
        int y = 5;
        float hasil = (float) x / y;
        System.out.printf("%d : %d = %f ",x,y,hasil);
    }
}
