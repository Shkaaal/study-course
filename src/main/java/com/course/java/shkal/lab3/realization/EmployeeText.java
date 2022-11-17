package com.course.java.shkal.lab3.realization;

import com.course.java.shkal.lab3.entity.Employee;

public class EmployeeText {

    public String employeeToText(Employee employee) {

        return "Имя: " + employee.getName()
                + "\nФамилия: " + employee.getSurname()
                + "\nОтчество: " + employee.getPatronymic()
                + "\nВозраст: " + employee.getAge()
                + "\nОтдел: " + employee.getDepartment()
                + "\nЗаработная плата: " + employee.getSalary();
    }
}
