/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11.pkg10116476.latihan1.nilaimahasiswa;

/**
 *
 * @author 
 * NAMA     : Idham Rahadian 
 * KELAS    : PBO11 
 * NIM      : 10116476 
 * Deskripsi Program    : Program ini berisi program untuk menampilkan 
 * biodata dan nilai mahasiswa yang telah di konversikan ke bentuk class dan objek
 *
 */
class Mahasiswa {

    String nim;
    String name;
    char index = 0;
    double quiz, uts, uas;

    void viewBiodata() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Nama ke " + i + "\t\t= " + name);
        }
        for (int j = 8; j >= 1; j--) {
            System.out.println("NIM ke " + j + "\t\t= " + nim + j);
        }
    }

    void countNilai() {
        double nQuiz = 0.2 * quiz;
        double nUts = 0.3 * uts;
        double nUas = 0.5 * uas;

        double nAkhir = nQuiz + nUts + nUas;

        System.out.println("\nQUIZ \t\t= " + quiz);
        System.out.println("UTS \t\t= " + uts);
        System.out.println("UAS \t\t= " + uas);

        System.out.println("\nNilai Akhir \t= " + nAkhir);

        if (nAkhir > 80 && nAkhir
                <= 100) {
            index = 'A';
        } else if (nAkhir > 68 && nAkhir
                <= 80) {
            index = 'B';
        } else if (nAkhir > 56 && nAkhir
                <= 68) {
            index = 'C';
        } else if (nAkhir > 45 && nAkhir
                <= 56) {
            index = 'D';
        } else if (nAkhir
                <= 45) {
            index = 'E';
        }

        switch (index) {
            case 'A':

                System.out.println("\nIndex = " + index);
                System.out.println("Sangat Baik");
                break;
            case 'B':
                System.out.println("\nIndex = " + index);
                System.out.println("Keterangan = Baik");
                break;
            case 'C':
                System.out.println("\nIndex = " + index);
                System.out.println("Keterangan = Cukup");
                break;
            case 'D':
                System.out.println("\nIndex = " + index);
                System.out.println("Keterangan = Kurang");
                break;
            case 'E':
                System.out.println("\nIndex = " + index);
                System.out.println("Keterangan = Sangat Kurang");
                break;
            default:
                System.out.println("\nUNRECOGNIZE");
        }
    }

}

public class PBO1110116476Latihan1NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.name = "Rizki Adam Kurniawan";
        mhs1.nim = "7.51.15.036.";
        mhs1.viewBiodata();

        mhs1.quiz = 30;
        mhs1.uts = 80;
        mhs1.uas = 40;
        mhs1.countNilai();

    }

}
