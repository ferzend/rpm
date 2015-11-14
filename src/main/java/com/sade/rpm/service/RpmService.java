package com.sade.rpm.service;

import com.sade.rpm.model.EmployeeEntity;
import com.sade.rpm.domain.Company;
import com.sade.rpm.domain.Employee;
import com.sade.rpm.domain.Project;
import com.sade.rpm.repository.RpmRepository;

import java.util.List;

public class RpmService implements SadeRpmService {

    private  RpmRepository rpmRepository;


    public RpmService (RpmRepository rpmRepository) {

        this.rpmRepository = rpmRepository;

    }

    @Override
    public Project insertProject(Project project) {
        return rpmRepository.insertProject(project);
    }

    @Override
    public Company insertCompany(Company company) {
        return rpmRepository.insertCompany(company);
    }

    @Override
    public Employee insertEmployee(Employee employee) {
        return rpmRepository.insertEmployee(employee);
    }

    @Override
    public List<EmployeeEntity> getAll() {
        return rpmRepository.getAll();
    }
}
