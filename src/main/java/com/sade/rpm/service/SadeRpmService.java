package com.sade.rpm.service;

import com.sade.rpm.domain.Company;
import com.sade.rpm.domain.Employee;
import com.sade.rpm.domain.Project;

public interface SadeRpmService {

    public void insertProject(Project project);

    void insertCompany(Company company);

    void insertEmployee(Employee employee);
}
