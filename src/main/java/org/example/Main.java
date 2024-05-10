package org.example;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/project";
        String user = "root" ;
        String pass = "" ;
        try (Connection myConn =DriverManager.getConnection(url,user,pass);
             Statement myStamt =myConn.createStatement();
             ResultSet myRes =myStamt.executeQuery("SELECT * FROM employees");
             ){

            while (myRes.next()){
                System.out.println(myRes.getString("first_name"));
            }

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Algo salio mal :(");
        }


    }
}