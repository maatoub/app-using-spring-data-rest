package com.nasr.appdatarest.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nasr.appdatarest.model.Employee;

public interface EmpRepository extends JpaRepository<Employee,Long>{
    
}
