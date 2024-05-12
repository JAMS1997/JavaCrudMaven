package org.example;

import model.Employee;
import repository.EmployeeRepository;
import repository.Repository;
import util.DataBaseConnection;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("--------Listando todos------");
        //Tipo generico<tipoDato> instancia = Instancia a la que pertenece
        Repository<Employee> repository = new EmployeeRepository();
        repository.findAll().forEach(System.out::println);

        System.out.println("----- Buscando por ID -----");
        System.out.println(repository.getById(10));

    }
}