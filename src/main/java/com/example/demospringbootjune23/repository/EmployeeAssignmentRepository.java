package com.example.demospringbootjune23.repository;

import com.example.demospringbootjune23.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface EmployeeAssignmentRepository extends JpaRepository<Employee, Long> {

    public Optional<Employee> findById(Long id);


    public Employee findByEmpName(String name);// SELECT * FROM EMPLOYEE WHERE NAME = ?

    public Employee findByEmpNameAndCity(String name, String city);

    public Employee findByIdAndCity(Long id, String city);
//find by section//

    @Query(value = "select * from EMPLOYEE_TABLE", nativeQuery = true)
    public List<Employee> getAllEmpNative();

    @Query(value = "select * from EMPLOYEE_TABLE where EMP_NAME=:name", nativeQuery = true)
    public Employee getEmpNameNative(@Param("name") String name);

    @Query(value = "select * from EMPLOYEE_TABLE where EMP_NAME=:name and DEPT=:dept", nativeQuery = true)
    public Employee getEmpNameDeptNative(@Param("name") String name, @Param("dept") String dept);

}
