package com.sade.rpm;

import com.sade.model.EmployeeEntity;
import com.sade.rpm.domain.Company;
import com.sade.rpm.domain.Employee;
import com.sade.rpm.domain.Project;
import com.sade.rpm.service.SadeRpmService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        SadeRpmService rpmService = (SadeRpmService) context.getBean("rpmService");

        rpmService.insertEmployee(getEmployee());


        for (EmployeeEntity employeeEntity : rpmService.getAll()) {
            System.out.println(employeeEntity.getEmployeeId() + employeeEntity.getEmployeeName());
        }


    }

    private static Project getNewProject() {
        Project project = new Project();

        project.setProjectId(123123);
        project.setProjectName("Müşteri bilgi yönetimi");

        return project;
    }

    public static Company getCompany() {
        Company company = new Company();
        company.setCompanyId(49879);
        company.setCompanyName("isbank");
        return company;
    }

    public static Employee getEmployee() {
        Employee employee = new Employee();
        employee.setEmployeeName("erdas");
        return employee;
    }
}
