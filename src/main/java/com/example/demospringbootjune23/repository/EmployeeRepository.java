package com.example.demospringbootjune23.repository;

import com.example.demospringbootjune23.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    public Optional<Employee> findById(Long id);

    public Employee findByEmpName(String name); // select * from EMPLOYEE WHERE name=?

    public Employee findByIdAndEmpName(Long id, String name);//select * from employee where name=? and id=?

    @Query(value="select * from EMP_JUNE_23",nativeQuery = true)
    public List<Employee> getAllEmpNative();

    @Query(value = "select * from EMP_JUNE_23 where EMP_NAME=:name",nativeQuery = true)
    public Employee getEmpNameNative(@Param("name") String name);

    @Query(value = "select * from EMP_JUNE_23 where EMP_NAME=:name and DEPT=:dept",nativeQuery = true)
    public Employee getEmpNameDeptNative(@Param("name") String name,@Param("dept") String dept);

    @Query(value = "delete from EMP_JUNE_23 where ID >=:start and ID <=:end",nativeQuery = true)
    public String deleteByRange(@Param("start") Long start,@Param("end") Long end);

}
