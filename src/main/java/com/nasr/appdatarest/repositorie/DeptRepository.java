package com.nasr.appdatarest.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.nasr.appdatarest.model.Department;

@RepositoryRestResource
public interface DeptRepository extends JpaRepository<Department, Long> {

}
