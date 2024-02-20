package com.example.demospringbootjune23.curd;

import com.example.demospringbootjune23.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeCURD {

    ArrayList<Employee> employeeArrayList = new ArrayList<>();


    @RequestMapping("/add_emp_obj")
    public String addEmployee(@RequestBody Employee employee) {
        employeeArrayList.add(employee);

        return "Employee added...";
    }

    //Add
    @RequestMapping("/add_emp/{name}/{id}/{dept}")
    public String addEmp(@PathVariable String name, @PathVariable int id, @PathVariable String dept) {
        Employee employee = new Employee(name, id, dept);
        employeeArrayList.add(employee);
        return "Employee Added Successfully...";
    }

    @RequestMapping("/get_all_emp")
    public ArrayList<Employee> getEmployeeArrayList() {

        return employeeArrayList;
    }

    @RequestMapping("/update_emp")
    public String updateEmp(@RequestParam String name, @RequestParam int index) {
        //get employee object
        Employee emp = employeeArrayList.get(index);//
        emp.setEmpName(name);
        employeeArrayList.set(index, emp);
        return "Record update_successfully...";
    }

    @RequestMapping("remove_emp/{index}")
    public String removeEmp(@PathVariable int index) {
        employeeArrayList.remove(index);
        return "record_deleted..";
    }


}