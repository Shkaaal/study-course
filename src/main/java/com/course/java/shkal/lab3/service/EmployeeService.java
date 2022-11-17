package com.course.java.shkal.lab3.service;

import com.course.java.shkal.lab3.entity.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface EmployeeService {
    String modelToJson(Employee employee) throws JsonProcessingException;

    String modelToText(Employee employee);

    String modelToXml(Employee employee);
}
