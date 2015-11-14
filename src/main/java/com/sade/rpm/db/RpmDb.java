package com.sade.rpm.db;

import com.sade.rpm.model.EmployeeEntity;
import com.sade.rpm.domain.Company;
import com.sade.rpm.domain.Project;

import java.util.List;

public interface RpmDb {
    void insertProject(Project project);

    void insertCompany(Company company);

    void insertEmployee(EmployeeEntity employee);

    List<EmployeeEntity> getAll();
}
