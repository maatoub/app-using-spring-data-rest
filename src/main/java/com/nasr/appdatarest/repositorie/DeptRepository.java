package com.nasr.appdatarest.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nasr.appdatarest.model.Department;

public interface DeptRepository extends JpaRepository<Department, Long> {

}
