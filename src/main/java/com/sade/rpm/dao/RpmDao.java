package com.sade.rpm.dao;

import com.sade.db.RpmDb;
import com.sade.rpm.domain.Company;
import com.sade.rpm.domain.Employee;
import com.sade.rpm.domain.Project;
import com.sade.rpm.repository.RpmRepository;

public class RpmDao implements RpmRepository {

    private final RpmDb rpmDb;

    public RpmDao(RpmDb rpmDb) {
        this.rpmDb = rpmDb;
    }

    @Override
    public void insertProject(Project project) {
        rpmDb.insertProject(project);
    }

    @Override
    public void insertCompany(Company company) {
        rpmDb.insertCompany(company);
    }

    @Override
    public void insertEmployee(Employee employee) {
        rpmDb.insertEmployee(employee);
    }
}
