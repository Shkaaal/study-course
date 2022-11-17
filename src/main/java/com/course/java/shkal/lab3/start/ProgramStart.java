package com.course.java.shkal.lab3.start;

import com.course.java.shkal.lab3.entity.Departments;
import com.course.java.shkal.lab3.entity.Employee;
import com.course.java.shkal.lab3.service.EmployeeServiceImpl;

public class ProgramStart {
    public static void main(String[] args) {

        Employee employee = new Employee("Vasya", "Pupkin", "Afanasievich",
                21, Departments.IT, 1337);

        EmployeeServiceImpl service = new EmployeeServiceImpl();

        System.out.println("Model to text:\n\n" + service.modelToText(employee));

        System.out.println("\n\nModel to Json:\n\n" + service.modelToJson(employee));

        System.out.println("\n\nModel to Xml:\n\n" + service.modelToXml(employee));
    }
}
