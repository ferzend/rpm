package com.sade.rpm.repository;

import com.sade.rpm.domain.Company;
import com.sade.rpm.domain.Employee;
import com.sade.rpm.domain.Project;

public interface RpmRepository {
    void insertProject(Project project);

    void insertCompany(Company company);

    void insertEmployee(Employee employee);
}
