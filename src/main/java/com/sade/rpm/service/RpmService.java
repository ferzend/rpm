package com.sade.rpm.service;

import com.sade.rpm.domain.Company;
import com.sade.rpm.domain.Employee;
import com.sade.rpm.domain.Project;
import com.sade.rpm.repository.RpmRepository;

public class RpmService implements SadeRpmService {

    private final RpmRepository rpmRepository;

    public RpmService (RpmRepository rpmRepository) {

        this.rpmRepository = rpmRepository;

    }

    @Override
    public void insertProject(Project project) {
        rpmRepository.insertProject(project);
    }

    @Override
    public void insertCompany(Company company) {
        rpmRepository.insertCompany(company);
    }

    @Override
    public void insertEmployee(Employee employee) {
        rpmRepository.insertEmployee(employee);
    }
}
