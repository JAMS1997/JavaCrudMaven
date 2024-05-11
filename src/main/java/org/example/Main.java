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

        try (Connection myConn = DataBaseConnection.getInstance()){
            Repository<Employee> repository = new EmployeeRepository();

            System.out.println("------ Insertando un empleado --------");
            Employee employee = new Employee();
            employee.setFirst_name("Diego");
            employee.setPa_surname("Pimentel");
            employee.setMa_surname("Guitierrez");
            employee.setEmail("diego@example.com");
            employee.setSalary(190000F);
            repository.save(employee);

            System.out.println("-------Listando--------");
            repository.findAll().forEach(System.out::println);
        }


    }
}