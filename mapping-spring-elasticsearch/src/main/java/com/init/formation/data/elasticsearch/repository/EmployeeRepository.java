package com.init.formation.data.elasticsearch.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Repository;
import com.init.formation.data.elasticsearch.model.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends ElasticsearchCrudRepository<Employee, Long> {
    List<Employee> findByOrganizationName(String name);
    List<Employee> findByName(String name);
}
