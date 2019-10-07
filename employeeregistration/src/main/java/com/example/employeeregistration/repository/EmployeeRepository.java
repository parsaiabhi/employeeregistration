package com.example.employeeregistration.repository;
/*
 * Copyright (C) 2007-2010 GoMobile Corp.
 * Copyright (C) 2011, 2013-2016 The GoMobile Team.
 *
 */

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeeregistration.entity.Employee;

/**
 *  @author abhishek
 *
 */

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
  
  public List<Employee> getAll();

}

