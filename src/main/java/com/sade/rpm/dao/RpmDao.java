package com.sade.rpm.dao;

import com.sade.rpm.domain.Company;
import com.sade.rpm.domain.Employee;
import com.sade.rpm.domain.Project;
import com.sade.rpm.repository.RpmRepository;

public class RpmDao implements RpmRepository {
    @Override
    public void insertProject(Project project) {
        System.out.println(project.getProjectId() +" id li" + project.getProjectName() +project.getCompanyId() +" id li şirket için oluşturuldu");
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
