package org.tnsif.service;

import org.tnsif.entities.Employee;

public interface EmployeeService {
	

    void addEmployee(Employee emp);
    Employee getEmployee(int id);
    void updateEmployee(Employee emp);
    void deleteEmployee(Employee emp);
    
    void beginTransaction();
    void commitTransaction();
    

}
