/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DatabaseConnection {
    
    private static Connection connect() {
        String dbURL
                = "jdbc:mysql://localhost:3306/club";
        String username = "root";
        String password = "root";
        // conectar
        try {
            Connection connection = DriverManager.getConnection(dbURL, username, password);
            if (connection != null) {
                System.out.println("Conectado");
            } 
            return  connection;
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.err.println("No conectado");

        }
        return null;
    }
    
    private static void crearEquipo(Connection connection, String nombre, int ranking) {
        String insert = "insert into equipo (nombre, ranking) values (?, ?)";
            try {
                PreparedStatement prepareStatement = connection.prepareStatement(insert);
                prepareStatement.setString(1, nombre);
                prepareStatement.setInt(2, ranking);
                prepareStatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    
    private static void actualizarEquipo(Connection connection, String nombre, int idEquipo) {
        String update = "update equipo set nombre = ? where id_equipo = ?";
            try {
                PreparedStatement prepareStatement = connection.prepareStatement(update);
                prepareStatement.setString(1, nombre);
                prepareStatement.setInt(2, idEquipo);
                prepareStatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    private static void borrarEquipo(Connection connection, int idEquipo) {
        String delete = "delete from equipo where id_equipo = ?";
            try {
                PreparedStatement prepareStatement = connection.prepareStatement(delete);
                prepareStatement.setInt(1, idEquipo);
                prepareStatement.executeUpdate();
                System.out.println("Equipo Borrado");
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    }

    private static void consultarEquipos(Connection connection, int ranking) {
        String query = "select * from equipo where ranking = ?";
        try {
            PreparedStatement prepareStatement = connection.prepareStatement(query);
            prepareStatement.setInt(1, ranking);
            ResultSet resultSet = prepareStatement.executeQuery();
            while(resultSet.next()) {
                int idEquipo = resultSet.getInt("id_equipo");
                String nombreEquipo = resultSet.getString("nombre");
                int rank = resultSet.getInt("ranking");

                System.out.println(String.format("El equipo %s con id %s y ranking %s", nombreEquipo, idEquipo, rank));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        Connection connection = connect();
        
        if(null != connection) {
            //crearEquipo(connection, "Union Magdalena", 2);
            actualizarEquipo(connection, "Llaneros", 9);
            consultarEquipos(connection, 2);
            borrarEquipo(connection, 9);
            consultarEquipos(connection, 2);
        }
    }

}
