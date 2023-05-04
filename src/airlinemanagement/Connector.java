/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlinemanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Admin
 */

    
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Admin
 */
public class Connector {

    Connection con;
    Statement st;

    Connector(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinemanagement", "root", "Sheetal@123");
            st = con.createStatement();

            if (con.isClosed()) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    
    catch(Exception ex)
    {
            ex.printStackTrace();
    }
}
    public static void main(String[] args) {
        new Connector();

    }
}

    

