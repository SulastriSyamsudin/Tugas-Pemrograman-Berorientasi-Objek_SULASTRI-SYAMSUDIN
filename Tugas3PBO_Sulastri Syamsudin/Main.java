import java.util.Scanner;

class Mahasiswa {
    String nim, nama;
    int nilai;
    String grade;

    // method untuk menentukan grade
    void hitungGrade() {
        if (nilai >= 80 && nilai <= 100) {
            grade = "A (lulus)";
        } else if (nilai >= 70) {
            grade = "B (lulus)";
        } else if (nilai >= 60) {
            grade = "C (lulus)";
        } else if (nilai >= 50) {
            grade = "D (tidak lulus)";
        } else if (nilai >= 0) {
            grade = "E (tidak lulus)";
        } else {
            grade = "Input nilai anda salah";
        }
    }

    // method untuk menampilkan hasil
    void tampilData() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Nilai : " + nilai);
        System.out.println("Grade : " + grade);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();

        // input data
        System.out.print("Masukkan NIM   : ");
        mhs.nim = input.nextLine();

        System.out.print("Masukkan Nama  : ");
        mhs.nama = input.nextLine();

        System.out.print("Masukkan Nilai : ");
        mhs.nilai = input.nextInt();

        // proses
        mhs.hitungGrade();

        // output
        System.out.println("\nHasil:");
        mhs.tampilData();
    }
}