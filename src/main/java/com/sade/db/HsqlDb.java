package com.sade.db;

import com.sade.model.EmployeeEntity;
import com.sade.rpm.domain.Company;
import com.sade.rpm.domain.Employee;
import com.sade.rpm.domain.Project;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class HsqlDb implements RpmDb {

    @PersistenceContext
    private EntityManager em;

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
        EmployeeEntity employeeEntity = new EmployeeEntity();

        employeeEntity.setEmployeeName(employee.getEmployeeName());

        em.persist(employeeEntity);

        System.out.println(employee.getEmployeeName() +" çalışanı eklendi" );
    }
}
