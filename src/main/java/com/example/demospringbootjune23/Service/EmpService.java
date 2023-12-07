package com.example.demospringbootjune23.Service;

import com.example.demospringbootjune23.Model.Emp_DB;
import com.example.demospringbootjune23.Repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {
    @Autowired
    EmpRepository repository;

    public String add( Emp_DB Emp ){
        repository.save(Emp);
        return "Successfully Save to Data Base";
    }
  //  public Emp_DB getEmployeeId(Long id){
  //   return repository.getById(id);
  //  }
  public Optional<Emp_DB> getEmployeeId(Long id){
      return repository.findById(id);
  }
    public Emp_DB getEmp_DBByName(@PathVariable String name) {
        return repository.findByEmpName(name);

    }
    public Emp_DB getEmp_DBByIdAndEmpName(Long id, String name ) {
        return repository.findByIdAndEmpName(id,name);
    }
    public Emp_DB getEmp_DBByCityAndEmpName( String name,  String city )
    {
        return repository.findByEmpNameAndEmpCity(name, city);
    }
    public List<Emp_DB> getAllEmp(){
        return repository.findAll();
    }
    public String RemovedById( Long id){
        repository.deleteById(id);
        return "Successfully deleted from data base...";

    }
    public String updateName( String name,  Long id){
        Emp_DB Emp=repository.getById(id);
        Emp.setEmpName(name);
        repository.save(Emp);
        return "Successfully update name "  +name;

    }

}
