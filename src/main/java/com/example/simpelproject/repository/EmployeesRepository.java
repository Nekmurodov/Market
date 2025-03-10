package com.example.simpelproject.repository;

import com.example.simpelproject.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Integer> {

    Optional<Employees> findByIdAndDeletedAtIsNull(Integer id);

}
