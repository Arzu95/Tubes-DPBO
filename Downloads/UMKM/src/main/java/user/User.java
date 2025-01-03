/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

public abstract class User {
    protected String username;
    protected String password;
    protected String nama;
    
    public String getNama() {
        return nama;
    }

    public User(String username, String password, String nama) {
        this.username = username;
        this.password = password;
        this.nama = nama;
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public abstract void displayInfo();
}
