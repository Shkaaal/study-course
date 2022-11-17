package com.course.java.shkal.lab3.service;

import com.course.java.shkal.lab3.entity.Employee;
import com.course.java.shkal.lab3.realization.EmployeeJson;
import com.course.java.shkal.lab3.realization.EmployeeText;
import com.course.java.shkal.lab3.realization.EmployeeXml;

public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public String modelToJson(Employee employee) {
        EmployeeJson employeeJson = new EmployeeJson();
        return employeeJson.employeeToJson(employee);
    }

    @Override
    public String modelToText(Employee employee) {
        EmployeeText employeeText = new EmployeeText();
        return employeeText.employeeToText(employee);
    }

    @Override
    public String modelToXml(Employee employee) {
        EmployeeXml employeeXml = new EmployeeXml();
        return employeeXml.employeeToXml(employee);
    }
}