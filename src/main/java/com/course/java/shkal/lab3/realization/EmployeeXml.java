package com.course.java.shkal.lab3.realization;

import com.course.java.shkal.lab3.entity.Employee;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

import java.io.StringWriter;

public class EmployeeXml {

    public String employeeToXml(Employee employee) {

        String xml = "";

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            StringWriter sw = new StringWriter();

            jaxbMarshaller.marshal(employee, sw);

            xml = sw.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return xml;
    }
}
