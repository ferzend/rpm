package com.sade.db;

import com.sade.rpm.domain.Company;
import com.sade.rpm.domain.Employee;
import com.sade.rpm.domain.Project;

public class FileDb implements RpmDb {


    @Override
    public void insertProject(Project project) {
        System.out.println(project.getProjectName()+"  projesi oluşturuldu");
    }

    @Override
    public void insertCompany(Company company) {
        System.out.println(company.getCompanyName() +" şirketi eklendi");
    }

    @Override
    public void insertEmployee(Employee employee) {
        System.out.println(employee.getEmployeeName() +" çalışanı eklendi" );
    }
}
