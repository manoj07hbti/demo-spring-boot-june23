package com.example.demospringbootjune23.assignmentPathVariable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssignmentNo_5_ {

    @RequestMapping("Palindrome/{num}")
    public String getPalindromeNumber(@PathVariable int num) {
        int number = num, result, temp, sum = 0;
        temp = number;
        while (number > 0) {
            result = number % 10;
            sum = (sum * 10) + result;
            number = number / 10;
        }
        if (temp == sum) {
            return "Number is a Palindrome Number :" + num;
        } else {
            return "Number is not a Palindrome Number :" + num;
        }
    }
}
