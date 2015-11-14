package com.sade.rpm.dao;

import com.sade.rpm.converter.FromDomainToEntityConverter;
import com.sade.rpm.db.RpmDb;
import com.sade.rpm.model.EmployeeEntity;
import com.sade.rpm.domain.Company;
import com.sade.rpm.domain.Employee;
import com.sade.rpm.domain.Project;
import com.sade.rpm.repository.RpmRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class RpmDao implements RpmRepository {


    private RpmDb rpmDb;
    FromDomainToEntityConverter converter;

    public RpmDao(RpmDb rpmDb) {
        this.rpmDb = rpmDb;
        converter = new FromDomainToEntityConverter();
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

        rpmDb.insertEmployee(converter.convert(employee));

        return employee;
    }

    @Override
    public List<EmployeeEntity> getAll() {
        return rpmDb.getAll();

    }


}
