/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supporttool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Chewbacca
 */
public class SupportTool {

    public static Connection con;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login l = new Login();
        Navigation m = new Navigation();
        l.setVisible(true);
    }

    public static Connection setDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://37.218.254.108:3306/web278_support?useTimezone=true&serverTimezone=UTC", "sup", "Knorke1337");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

}
