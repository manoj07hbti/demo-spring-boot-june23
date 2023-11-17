package com.example.demospringbootjune23.DemoController;

import com.example.demospringbootjune23.Model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeController {
    ArrayList<Employee> employeeArrayList=new ArrayList<>();
    @RequestMapping("/add_emp/{Name}/{Id}/{Dept}")
    public String addEmp(@PathVariable String Name, @PathVariable int Id, @PathVariable String Dept){
        Employee employee=new Employee(Name,Id,Dept);
        employeeArrayList.add(employee);
        return "Employee Added Successfully.....";
    }
    @RequestMapping("/get_All_emp")
    public ArrayList<Employee> getEmployeeArrayList(){
        return employeeArrayList;
    }
    @RequestMapping("/update_emp")
    public String updateEmp(@RequestParam String Name,@RequestParam int index ){
        // get employee object
    Employee emp=employeeArrayList.get(index);
    emp.setEmpName(Name);
        employeeArrayList.set(index,emp);
        return "Updated Successfully....";

    }
    @RequestMapping("/remove_emp/{index}")
    public String removeEmp(@PathVariable int index){
        employeeArrayList.remove(index);
        return "Removed Employee Successfully...";

    }
}
