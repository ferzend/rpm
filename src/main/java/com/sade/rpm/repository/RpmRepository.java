package com.sade.rpm.repository;

import com.sade.model.EmployeeEntity;
import com.sade.rpm.domain.Company;
import com.sade.rpm.domain.Employee;
import com.sade.rpm.domain.Project;

import java.util.List;

public interface RpmRepository {

    public Project insertProject(Project project);

    public Company insertCompany(Company company);

    public Employee insertEmployee(Employee employee);

    public List<EmployeeEntity> getAll();
}
