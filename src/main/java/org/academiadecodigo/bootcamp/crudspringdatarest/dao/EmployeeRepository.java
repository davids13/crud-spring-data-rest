package org.academiadecodigo.bootcamp.crudspringdatarest.dao;

import org.academiadecodigo.bootcamp.crudspringdatarest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //that´s it... no need to write any code

    // with SPRING DATA REST we dont need controller and service layer implementation :) ONLY THIS INTERFACE

    //APP -> endpoints -> REPOSITORY LAYER(dao layer) -> DB
}
