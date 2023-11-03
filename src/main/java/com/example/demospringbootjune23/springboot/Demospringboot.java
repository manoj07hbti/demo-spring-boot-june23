package com.example.demospringbootjune23.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Demospringboot {

    @RequestMapping("/hello")
    public void hello() {
        System.out.println("welcome to spring boot project");
    }

    @RequestMapping("/welcome")
    public String welcome() {

        return "hello this is spring boot project";
    }

    @RequestMapping("/multiple")
    public String multiple() {
        int a = 10;
        int b = 5;
        int multiple = a * b;

        return "multiple two number " + multiple;
    }

    @RequestMapping("/sum")
    public String sum() {

        int a = 30;
        int b = 40;
        int sum = a + b;
        return "sum of two number " + sum;
    }

    @RequestMapping("/divide")
    public String divide() {

        int a = 20;
        int b = 10;
        int divide = a - b;
        return "Divide two number : " + divide;

    }

    @RequestMapping("/square")
    public String squareNumber() {
        int number = 4;
        int result = number * number;

        return "square number :" + result;
    }

    @RequestMapping("/subtraction")
    public String subtraction() {

        double a = 50;
        double b = 15;

        double sub = a / b;
        return "subtraction of two number :" + sub;
    }

    @RequestMapping("/BrandName")
    public ArrayList brandName() {
        ArrayList brand = new ArrayList();

        brand.add("ADIDAS");
        brand.add("PUMA");
        brand.add("NIKE");

        return brand;

    }

    @RequestMapping("/factorial")
    public void factorialNumber() {

        int number = 5;

        int factorial = 1;

        for (int i = number; i > 0; i--) {

            factorial = factorial * i;
        }
        System.out.println("Print factorial number: " + factorial);
    }

    @RequestMapping("/primeNumber")
    public void primeNumber() {

        int number = 30;
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {

            if (number % 2 == 0) {

                isPrime = false;
            }
        }
        if (isPrime) {

            System.out.println("Given number is prime Number :" + number);
        } else {
            System.out.println("Given numbr is not prime Number :" + number);

        }
    }

    @RequestMapping("EvenOddNumber")
    public void EvenOddNumber() {


        int number = 15;

        if (number % 2 == 0) {

            System.out.println("Given number is even number :" + number);
        } else {

            System.out.println("Given number is odd number :" + number);
        }
    }
}



