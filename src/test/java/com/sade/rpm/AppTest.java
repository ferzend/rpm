package com.sade.rpm;

import com.sade.rpm.domain.Employee;
import com.sade.rpm.model.EmployeeEntity;
import com.sade.rpm.service.SadeRpmService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppTest
{
    static SadeRpmService rpmService;

    @BeforeClass
    public static void beforeClass() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        rpmService = (SadeRpmService) context.getBean("rpmService");
    }


    @Test
    public void testApp() {


        rpmService.insertEmployee(getEmployee());

        for (EmployeeEntity employeeEntity : rpmService.getAll()) {
            System.out.println(employeeEntity);
        }


    }

    public static Employee getEmployee() {
        Employee employee = new Employee();
        employee.setEmployeeId(2l);
        employee.setEmployeeName("ferhat");
        return employee;
    }
}
