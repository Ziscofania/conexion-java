package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/terminal de buses?useSSL=false&serverTimezone=UTC";
        String user = "root"; // cambia si tienes otro usuario
        String password = ""; // pon tu contraseña si tiene

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("✅ ¡Conexión exitosa!");
            con.close();
        } catch (SQLException e) {
            System.out.println("❌ Error en la conexión:");
            e.printStackTrace();
        }
    }
}
