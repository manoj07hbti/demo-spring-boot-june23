package com.example.demospringbootjune23.assignments.assignmentsecond;

import com.example.demospringbootjune23.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AssignmentUsingPathVariable {
    ArrayList<Employee> employeeArrayList=new ArrayList<>();
@RequestMapping("/addition/{a}/{b}")
    public String addition(@PathVariable int a,@PathVariable  int b)
    {
        return "Addition is :"+(a+b);
    }
    @RequestMapping("/sub/{c}/{d}")
    public String subtraction(@PathVariable int c,@PathVariable int d)
    {
        return "subtraction is:"+(c-d);
    }
    @RequestMapping("mul/{a}/{b}")
    public String multiplication(@PathVariable int a,@PathVariable int b)
    {
        return "multiplication is:"+(a*b);
    }
    @RequestMapping("div/{a}/{b}")
    public String division(@PathVariable int a,@PathVariable int b)
    {
        return "division is:"+(a/b);
    }
@RequestMapping("/arm/{number}")
    public String armstrongNo(@PathVariable int number){
        int temp,rem,arm=0;
        temp=number;
        while (number>0){

            rem=number%10;//3
            arm=(rem*rem*rem)+arm;
            //3*3*3=27
            number=number/10;//15/10
        }
        if (temp==arm){
            return "Number is ArmStrong number:"+arm;
        }
        else {
            return "Number is not ArmStrong number:"+arm;
        }
}
@RequestMapping("/pal/{num}")

public String PalindromeNo(@PathVariable int num)
{
    int rem,temp,rev=0;
temp=num;
    while (num>0)//121
    {
        rem=num%10;//1,2,1

        rev=(rev*10)+rem;//0*10+1=1,1*10+2=12,12*10+1=121
        num=num/10;

    }
    if (temp==rev)
    {
        return "Palindrome number "+rev;
    }

    return "Not palindrome number"+rev;
}
@RequestMapping("/emp/{empName}/{empId}/{dept}")
public String employee(String empName,int empId,String dept){

    Employee employee=new Employee(empName,empId,dept);
    employeeArrayList.add(employee);
    return "Employee added successful...";


}
}
