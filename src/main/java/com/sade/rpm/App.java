package com.sade.rpm;

import com.sade.db.FileDb;
import com.sade.rpm.dao.RpmDao;
import com.sade.rpm.domain.Company;
import com.sade.rpm.domain.Employee;
import com.sade.rpm.domain.Project;
import com.sade.rpm.service.RpmService;
import com.sade.rpm.service.SadeRpmService;

/**
 * Hello world!
 *
 */
public class App
{



    public static void main(String[] args) {


        SadeRpmService service = new RpmService(new RpmDao(new FileDb()));

        service.insertProject(getNewProject());

        service.insertCompany(getCompany());

        service.insertEmployee(getEmployee());


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
        employee.setEmployeeId(6546456);
        employee.setEmployeeName("ferhat");
        return employee;
    }
}
