package com.course.java.shkal.lab3.realization;

import com.course.java.shkal.lab3.entity.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeJson {

    ObjectMapper objectMapper = new ObjectMapper();

    public String employeeToJson(Employee employee) {

        String json = "";
        try {
            json = objectMapper.writeValueAsString(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return json;
    }
}
