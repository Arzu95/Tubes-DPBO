/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes.dpbo.service;

/**
 *
 * @author rakhafatihathallah
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import tubes.dpbo.dblayer.Database;

public class UMKMService {
    
    public static void createUMKM(String nama, String notelp, String username, String password) {
        String query = "INSERT INTO UMKM (nama, notelp, username, password) VALUES (?, ?, ?, ?)";
        try (Connection connection = Database.connect()) {
            int rows = Database.executeUpdate(connection, query, nama, notelp, username, password);
            System.out.println(rows + " UMKM berhasil ditambahkan.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
  }
    
}
