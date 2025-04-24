package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // URL de conexión a MySQL, con el nombre de la base de datos 'prueba'
        String url = "jdbc:mysql://localhost:3306/prueba?useSSL=false&serverTimezone=UTC";

        // Usuario y contraseña de tu base de datos MySQL
        String usuario = "root";  // Usa tu usuario de MySQL
        String contraseña = "tu_contraseña";  // Cambia con tu contraseña real

        // Intentamos hacer la conexión
        try (Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "password")) {
            System.out.println("✅ ¡Conexión exitosa a la base de datos 'prueba'!");
        } catch (SQLException e) {
            System.out.println("❌ Error al conectar a la base de datos:");
            e.printStackTrace();
        }    }
}