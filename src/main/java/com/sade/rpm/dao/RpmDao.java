package com.sade.rpm.dao;

import com.sade.db.RpmDb;
import com.sade.model.EmployeeEntity;
import com.sade.rpm.domain.Company;
import com.sade.rpm.domain.Employee;
import com.sade.rpm.domain.Project;
import com.sade.rpm.repository.RpmRepository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
public class RpmDao implements RpmRepository {

    @PersistenceContext
    private EntityManager em;

    private RpmDb rpmDb;

    public RpmDao() {}

    public RpmDao(RpmDb rpmDb) {
        this.rpmDb = rpmDb;
    }

    @Override
    public Project insertProject(Project project) {
        rpmDb.insertProject(project);

        return project;
    }

    @Override
    public Company insertCompany(Company company) {
        rpmDb.insertCompany(company);

        return company;
    }

    @Override
    public Employee insertEmployee(Employee employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();

        employeeEntity.setEmployeeName(employee.getEmployeeName());

        em.persist(employeeEntity);


        System.out.println(employee.getEmployeeName() +" çalışanı eklendi" );

        return employee;
    }

    @Override
    public List<EmployeeEntity> getAll() {
        return em.createQuery("SELECT e FROM EmployeeEntity e", EmployeeEntity.class).getResultList();
    }


}
