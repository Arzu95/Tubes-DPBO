/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import service.UMKMService;
import service.MentorService;
import user.Mentor;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UMKMService umkmService = new UMKMService();
        MentorService mentorService = new MentorService();

        // Simulasi data mentor
        HashMap<Integer, Mentor> mentorData = mentorService.getMentorData();

        boolean exit = false; // Variabel untuk keluar dari program

        while (!exit) {
            System.out.println("\n=== Aplikasi UMKM ===");
            System.out.println("1. Login sebagai Pelaku UMKM");
            System.out.println("2. Login sebagai Mentor");
            System.out.println("0. Keluar");
            System.out.print("Pilih (1/2/0): ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        // Pelaku UMKM: Operasikan UMKMService
                        umkmService.showMenu(mentorData);
                        break;
                    case 2:
                        // Mentor: Operasikan MentorService
                        mentorService.showMenu();
                        break;
                    case 0:
                        System.out.println("Terima kasih telah menggunakan aplikasi UMKM.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } catch (Exception e) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                scanner.nextLine(); // Clear invalid input
            }
        }

        scanner.close();
    }
}
