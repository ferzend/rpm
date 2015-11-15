package com.sade.rpm.converter;

import com.sade.rpm.domain.Employee;
import com.sade.rpm.model.EmployeeEntity;

public class FromDomainToEntityConverter {

    public EmployeeEntity convert(Employee source) {
        EmployeeEntity target = new EmployeeEntity();

        if (source.getEmployeeId() != null) {
            target.setEmployeeId(source.getEmployeeId());
        }

        target.setEmployeeName(source.getEmployeeName());

        return target;

    }
}
