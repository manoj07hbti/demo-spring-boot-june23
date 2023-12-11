package com.example.demospringbootjune23.repository;

import com.example.demospringbootjune23.model.Employee;
import com.example.demospringbootjune23.model.Engineer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EngineerRepository extends JpaRepository<Engineer,Long> {
    // default method
//    public Engineer deleteByName(String name);
    //get by name
    public Engineer findByName(String name);
    // get by salary
    public Engineer findBySalary(int salary);

    @Query(value="select * from engg_data",nativeQuery = true)
    public List<Engineer> getAllEnggNative();
    @Query(value="select * from engg_data where name=:name",nativeQuery=true)
    public Engineer getEnggNameNative(@Param("name")String name);

    @Query(value="select * from engg_data where name=:name and company=:company",nativeQuery=true)
    public Engineer getEnggNameAndCompanyNative(@Param("name")String name,@Param( "company") String company);

//    @Query(value="delete from engg_data where ID >=:start to ID <=:end",nativeQuery = true)
//    public Long deletByRange(@Param("start")Long start,@Param("end") Long end);
}
