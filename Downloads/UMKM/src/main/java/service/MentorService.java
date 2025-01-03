/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import user.Mentor;
import entity.Kelas;

import java.util.HashMap;
import java.util.Scanner;

public class MentorService {
    private HashMap<Integer, Mentor> mentorData = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);
    public HashMap<Integer, Mentor> getMentorData() {
    return mentorData;
}

public void initializeMentorData() {
    Mentor mentor1 = new Mentor("mentor1", "pass", "John Doe");
    mentor1.tambahKelas(new Kelas("Kelas Marketing", "Belajar strategi marketing"));
    mentor1.tambahKelas(new Kelas("Kelas Keuangan", "Manajemen keuangan untuk UMKM"));

    Mentor mentor2 = new Mentor("mentor2", "pass", "Jane Smith");
    mentor2.tambahKelas(new Kelas("Kelas Teknologi", "Pemanfaatan teknologi untuk UMKM"));

    mentorData.put(1, mentor1);
    mentorData.put(2, mentor2);
}

    public void showMenu() {
        System.out.println("=== Menu Mentor ===");

        // Data Dummy
        Mentor mentor = new Mentor("mentor1", "pass", "Mentor Bisnis");
        mentor.tambahKelas(new Kelas("Kelas 1", "Belajar dasar bisnis"));
        mentorData.put(1, mentor);

        int choice;
        do {
            System.out.println("\n1. Tambah Mentor");
            System.out.println("2. Menu Kelas");
            System.out.println("3. Lihat info mentor");
            System.out.println("4. Lihat Info kelas");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    tambahMentor();
                    break;
                case 2:
                   menuCRUDKelas();
                    break;
                case 3:
                    lihatInfoMentor();
                    break;
                case 4:
                   tampilkanKelas();
                    break;
                case 0:
                    System.out.println("Keluar dari menu Mentor.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 0);
    }

    private void lihatInfoMentor() {
        for (Mentor mentor : mentorData.values()) {
            mentor.displayInfo();
        }
    }

    private void tampilkanKelas() {
        System.out.print("Masukkan ID Mentor: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Mentor mentor = mentorData.get(id);
        if (mentor != null) {
            System.out.println("Kelas yang dimiliki oleh " + mentor.getNama() + ":");
            for (Kelas kelas : mentor.getKelasList()) {
                System.out.println("- " + kelas.getNamaKelas() + " | " + kelas.getDeskripsi());
            }
        } else {
            System.out.println("Mentor tidak ditemukan.");
        }
    }

    private void tambahMentor() {
        System.out.print("Masukkan ID Mentor: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Masukkan nama Mentor: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();
        System.out.print("Masukkan bidang mentor: ");
        String bidang = scanner.nextLine();

        Mentor mentor = new Mentor(nama, password, bidang);
        mentorData.put(id, mentor);
        System.out.println("Mentor berhasil ditambahkan.");
    }

    private void menuCRUDKelas() {
        System.out.print("Masukkan ID Mentor: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Mentor mentor = mentorData.get(id);
        if (mentor == null) {
            System.out.println("Mentor tidak ditemukan.");
            return;
        }

        int choice;
        do {
            System.out.println("\n=== CRUD Kelas ===");
            System.out.println("1. Tambah Kelas");
            System.out.println("2. Lihat Kelas");
            System.out.println("3. Update Kelas");
            System.out.println("4. Hapus Kelas");
            System.out.println("0. Kembali");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    tambahKelas(mentor);
                    break;
                case 2:
                    lihatKelas(mentor);
                    break;
                case 3:
                    updateKelas(mentor);
                    break;
                case 4:
                    hapusKelas(mentor);
                    break;
                case 0:
                    System.out.println("Kembali ke menu utama.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 0);
    }

    private void tambahKelas(Mentor mentor) {
        System.out.print("Masukkan nama kelas: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan deskripsi kelas: ");
        String deskripsi = scanner.nextLine();

        mentor.tambahKelas(new Kelas(nama, deskripsi));
        System.out.println("Kelas berhasil ditambahkan.");
    }

    private void lihatKelas(Mentor mentor) {
        if (mentor.getKelasList().isEmpty()) {
            System.out.println("Tidak ada kelas yang tersedia.");
        } else {
            for (Kelas kelas : mentor.getKelasList()) {
                System.out.println("- " + kelas.getNamaKelas() + " | " + kelas.getDeskripsi());
            }
        }
    }

    private void updateKelas(Mentor mentor) {
        System.out.print("Masukkan nama kelas yang akan diupdate: ");
        String nama = scanner.nextLine();

        for (Kelas kelas : mentor.getKelasList()) {
            if (kelas.getNamaKelas().equalsIgnoreCase(nama)) {
                System.out.print("Masukkan nama baru: ");
                kelas.setNamaKelas(scanner.nextLine());
                System.out.print("Masukkan deskripsi baru: ");
                kelas.setDeskripsi(scanner.nextLine());
                System.out.println("Kelas berhasil diupdate.");
                return;
            }
        }
        System.out.println("Kelas tidak ditemukan.");
    }

    private void hapusKelas(Mentor mentor) {
        System.out.print("Masukkan nama kelas yang akan dihapus: ");
        String nama = scanner.nextLine();

        if (mentor.getKelasList().removeIf(kelas -> kelas.getNamaKelas().equalsIgnoreCase(nama))) {
            System.out.println("Kelas berhasil dihapus.");
        } else {
            System.out.println("Kelas tidak ditemukan.");
        }
    }
}
