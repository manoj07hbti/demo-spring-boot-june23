package com.example.demospringbootjune23.assignmentPathVariable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssignmentNo_4_ {

    @RequestMapping("/ARMSTRONG_NUMBER/{num}")
    public String armstrongNumber(@PathVariable int num) {

        int number = num, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (result == number) {
            return "Number is an Armstrong number." + num;
        } else {
            return "Number is not an Armstrong number." + num;
        }
    }

    @RequestMapping("/ARMSTRONG_NO/{num}")
    public String checkArmstrongNumber(@PathVariable int num) {
        int number = num, number2, temp, total = 0;
        number2 = number;
        while (number2 != 0) {
            temp = number2 % 10;
            total = total + temp * temp * temp;
            number2 /= 10;

        }
        if (total == number) {
            return "Number is an Armstrong Number " + num;
        } else {
            return "Number is not an Armstrong Number " + num;
        }
    }
}
