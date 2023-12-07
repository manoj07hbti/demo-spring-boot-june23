package com.example.demospringbootjune23.DemoController;

import com.example.demospringbootjune23.Model.Emp_DB;
import com.example.demospringbootjune23.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class EmpController {
    @Autowired
    EmpService  service;
    @PostMapping("/add_Emp_DB")
    public String add(@RequestBody Emp_DB Emp ){
        return service.add(Emp);
    }
    @GetMapping("/get_all_emp")
    public List<Emp_DB> getAllEmp(){

        return service.getAllEmp();
    }
   // @GetMapping("/get_Emp_by_id/{id}")
  //  public Emp_DB getEmployeeId(@PathVariable Long id){
    //   return service.getEmployeeId(id);
    //}
   @GetMapping("/get_Emp_by_id/{id}")
   public Optional<Emp_DB> getEmployeeId(@PathVariable Long id)
   {
       return service.getEmployeeId(id);
   }
    @GetMapping("/get_Emp_by_name/{name}")
    public Emp_DB getEmp_DBByName(@PathVariable String name)
    {
        return service.getEmp_DBByName(name) ;
    }
    @GetMapping("/get_Emp_by_id_name/{id}/{name}")
    public Emp_DB getEmp_DBByIdEmpName(@PathVariable Long id,@PathVariable String name)
    {
        return service.getEmp_DBByIdAndEmpName(id, name);
    }
    @GetMapping("/get_Emp_by_id_name_city/{name}/{city}")
    public Emp_DB getEmp_DBByIdEmpName(@PathVariable String name,@PathVariable String city )
    {
        return service.getEmp_DBByCityAndEmpName(name, city);
    }

    @DeleteMapping("/Deleted_Emp_DB/{id}")
    public String Deleted(@PathVariable Long id){

        return service.RemovedById(id);
    }
    @PutMapping("/Update_Emp_DB")
    public String updateName(@RequestParam String name,@RequestParam Long id){
     return service.updateName(name, id);

    }
}


