package com.sade.rpm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EmployeeEntity {

    @Id
    private long employeeId;
    private String employeeName;

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }


    @Override
    public String toString() {
        return "Employee [id=" + employeeId + ", employeeName=" + employeeName + "]";
    }
}
