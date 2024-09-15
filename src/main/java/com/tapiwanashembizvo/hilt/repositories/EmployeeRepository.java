package com.tapiwanashembizvo.hilt.repositories;

import com.tapiwanashembizvo.hilt.models.BusinessUnit;
import com.tapiwanashembizvo.hilt.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
