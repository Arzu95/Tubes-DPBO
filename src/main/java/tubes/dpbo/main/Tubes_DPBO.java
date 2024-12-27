/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tubes.dpbo.main;
import java.sql.Connection;
import tubes.dpbo.dblayer.Database;
/**
 *
 * @author applejenius.id
 */
public class Tubes_DPBO {

    public static void main(String[] args) {
        try (Connection connection = Database.connect()) {
            System.out.println("sukses connect");
        } catch (Exception e) {
            System.out.println("gagal connect");
            System.out.println(e.getMessage());
        }
    }
}
