package com.sade.rpm.db;

import com.sade.rpm.model.EmployeeEntity;
import com.sade.rpm.domain.Company;
import com.sade.rpm.domain.Project;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

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
    public void insertEmployee(EmployeeEntity employee) {

       em.find(EmployeeEntity.class, employee.getEmployeeId());

//        em.persist(employee);
        em.merge(employee);

    }

    @Override
    public List<EmployeeEntity> getAll() {
        return em.createQuery("SELECT e FROM EmployeeEntity e", EmployeeEntity.class).getResultList();
    }
}
