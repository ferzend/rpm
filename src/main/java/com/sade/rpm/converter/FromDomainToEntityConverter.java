package com.sade.rpm.converter;

import com.sade.rpm.domain.Employee;
import com.sade.rpm.model.EmployeeEntity;

public class FromDomainToEntityConverter {

    public EmployeeEntity convert(Employee source) {
        EmployeeEntity target = new EmployeeEntity();

        target.setEmployeeName(source.getEmployeeName());

        return target;

    }
}
