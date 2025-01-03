/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import user.UMKM;
import entity.Item;
import entity.Hutang;
import entity.Kelas;

import java.util.HashMap;
import java.util.Scanner;
import user.Mentor;

public class UMKMService {
    private HashMap<Integer, UMKM> umkmData = new HashMap<>();
    private HashMap<Integer, Hutang> hutangData = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void showMenu(HashMap<Integer, Mentor> mentorData) {
    System.out.println("=== Menu UMKM ===");
    UMKM umkm = new UMKM("umkm1", "pass", "UMKM Sukses", "08123456789");

    int choice;
    do {
        System.out.println("\n1. Menu Item");
        System.out.println("2. Menu Pemasukan");
        System.out.println("3. Menu Hutang");
        System.out.println("4. Menu Kelas");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
        choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                menuItemCRUD(umkm);
                break;
            case 2:
                menuPemasukanCRUD(umkm);
                break;
            case 3:
                menuHutangCRUD();
                break;
            case 4:
                menuKelas(umkm, mentorData);
                break;
            case 0:
                System.out.println("Keluar dari menu UMKM.");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    } while (choice != 0);
}


    private void menuKelas(UMKM umkm, HashMap<Integer, Mentor> mentorData) {
    int choice;
    do {
        System.out.println("\n=== Menu Kelas ===");
        System.out.println("1. Lihat Kelas Mentor");
        System.out.println("2. Daftar ke Kelas");
        System.out.println("3. Lihat Kelas Saya");
        System.out.println("0. Kembali");
        System.out.print("Pilih menu: ");
        choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                tampilkanKelasMentor(mentorData);
                break;
            case 2:
                daftarKelas(umkm, mentorData);
                break;
            case 3:
                lihatKelasSaya(umkm);
                break;
            case 0:
                System.out.println("Kembali ke menu utama.");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    } while (choice != 0);
}


private void tampilkanKelasMentor(HashMap<Integer, Mentor> mentorData) {
    System.out.println("\n=== Daftar Kelas Mentor ===");
    for (Mentor mentor : mentorData.values()) {
        System.out.println("Mentor: " + mentor.getNama());
        for (Kelas kelas : mentor.getKelasList()) {
            System.out.println("- " + kelas.getNamaKelas() + " | " + kelas.getDeskripsi());
        }
    }
}

private void daftarKelas(UMKM umkm, HashMap<Integer, Mentor> mentorData) {
    System.out.println("\n=== Daftar ke Kelas ===");
    tampilkanKelasMentor(mentorData);

    System.out.print("Masukkan nama kelas yang ingin didaftar: ");
    String namaKelas = scanner.nextLine();

    for (Mentor mentor : mentorData.values()) {
        for (Kelas kelas : mentor.getKelasList()) {
            if (kelas.getNamaKelas().equalsIgnoreCase(namaKelas)) {
                umkm.tambahKelas(kelas);
                System.out.println("Berhasil mendaftar ke kelas: " + namaKelas);
                return;
            }
        }
    }
    System.out.println("Kelas tidak ditemukan.");
}

private void lihatKelasSaya(UMKM umkm) {
    System.out.println("\n=== Kelas Saya ===");
    if (umkm.getKelasList().isEmpty()) {
        System.out.println("Anda belum mendaftar ke kelas apa pun.");
    } else {
        for (Kelas kelas : umkm.getKelasList()) {
            System.out.println("- " + kelas.getNamaKelas() + " | " + kelas.getDeskripsi());
        }
    }
}





    // CRUD untuk Item
    private void menuItemCRUD(UMKM umkm) {
        int choice;
        do {
            System.out.println("\n=== CRUD Item ===");
            System.out.println("1. Tambah Item");
            System.out.println("2. Lihat Item");
            System.out.println("3. Update Item");
            System.out.println("4. Hapus Item");
            System.out.println("0. Kembali");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    tambahItem(umkm);
                    break;
                case 2:
                    lihatItem(umkm);
                    break;
                case 3:
                    updateItem(umkm);
                    break;
                case 4:
                    hapusItem(umkm);
                    break;
                case 0:
                    System.out.println("Kembali ke menu utama.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 0);
    }

    private void tambahItem(UMKM umkm) {
        System.out.print("Masukkan nama item: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan harga item: ");
        double harga = scanner.nextDouble();
        System.out.print("Masukkan stok item: ");
        int stok = scanner.nextInt();
        umkm.tambahItem(new Item(nama, harga, stok));
        System.out.println("Item berhasil ditambahkan.");
    }

    private void lihatItem(UMKM umkm) {
        if (umkm.getItemList().isEmpty()) {
            System.out.println("Tidak ada item yang tersedia.");
        } else {
            for (Item item : umkm.getItemList()) {
                System.out.println("- " + item.getNamaBarang() + " | Harga: " + item.getHargaBarang() + " | Stok: " + item.getStok());
            }
        }
    }

    private void updateItem(UMKM umkm) {
        System.out.print("Masukkan nama item yang akan diupdate: ");
        String nama = scanner.nextLine();
        for (Item item : umkm.getItemList()) {
            if (item.getNamaBarang().equalsIgnoreCase(nama)) {
                System.out.print("Masukkan harga baru: ");
                item.setHargaBarang(scanner.nextDouble());
                System.out.print("Masukkan stok baru: ");
                item.setStok(scanner.nextInt());
                System.out.println("Item berhasil diupdate.");
                return;
            }
        }
        System.out.println("Item tidak ditemukan.");
    }

    private void hapusItem(UMKM umkm) {
        System.out.print("Masukkan nama item yang akan dihapus: ");
        String nama = scanner.nextLine();
        umkm.getItemList().removeIf(item -> item.getNamaBarang().equalsIgnoreCase(nama));
        System.out.println("Item berhasil dihapus.");
    }

    // CRUD untuk Pemasukan
    private void menuPemasukanCRUD(UMKM umkm) {
        int choice;
        do {
            System.out.println("\n=== CRUD Pemasukan ===");
            System.out.println("1. Tambah Pemasukan");
            System.out.println("2. Lihat Pendapatan");
            System.out.println("0. Kembali");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    tambahPemasukan(umkm);
                    break;
                case 2:
                    lihatPendapatan(umkm);
                    break;
                case 0:
                    System.out.println("Kembali ke menu utama.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 0);
    }
    
    
    
    
    private void tambahPemasukan(UMKM umkm) {
        System.out.print("Masukkan bulan pemasukan: ");
        String bulan = scanner.nextLine();
        System.out.print("Masukkan jumlah pemasukan: ");
        double jumlah = scanner.nextDouble();
        umkm.tambahPendapatan(bulan, jumlah);
    }

    private void lihatPendapatan(UMKM umkm) {
    System.out.print("Masukkan bulan untuk melihat pendapatan: ");
    String bulan = scanner.nextLine(); // Input bulan
    double pendapatan = umkm.lihatPendapatan(bulan); // Memanggil metode di UMKM
    System.out.println("Pendapatan bulan " + bulan + ": " + pendapatan);
}
    // CRUD untuk Hutang
    private void menuHutangCRUD() {
        int choice;
        do {
            System.out.println("\n=== CRUD Hutang ===");
            System.out.println("1. Tambah Hutang");
            System.out.println("2. Lihat Hutang");
            System.out.println("0. Kembali");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    tambahHutang();
                    break;
                case 2:
                    lihatHutang();
                    break;
                case 0:
                    System.out.println("Kembali ke menu utama.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 0);
    }

    private void tambahHutang() {
        System.out.print("Masukkan ID Penghutang: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Masukkan nama penghutang: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan nomor telepon: ");
        String telepon = scanner.nextLine();
        System.out.print("Masukkan alamat: ");
        String alamat = scanner.nextLine();
        System.out.print("Masukkan nilai hutang: ");
        double nilai = scanner.nextDouble();
        Hutang hutang = new Hutang(id, nama, telepon, alamat, nilai, false);
        hutangData.put(id, hutang);
        System.out.println("Hutang berhasil ditambahkan.");
    }

    private void lihatHutang() {
        if (hutangData.isEmpty()) {
            System.out.println("Tidak ada data hutang.");
        } else {
            System.out.println("Daftar Hutang:");
            for (Hutang hutang : hutangData.values()) {
                System.out.println(hutang.toString());
            }
        }
    }
}
