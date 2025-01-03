/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

import entity.Kelas;
import java.util.ArrayList;
 

public class Mentor extends User {
    private ArrayList<Kelas> kelasList;

    public Mentor(String username, String password, String nama) {
        super(username, password, nama);
        this.kelasList = new ArrayList<>();
    }

    public void tambahKelas(Kelas kelas) {
        kelasList.add(kelas);
    }

    public ArrayList<Kelas> getKelasList() {
        return kelasList;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public void displayInfo() {
        System.out.println("Mentor: " + nama);
    }
}
