package com.example.demospringbootjune23.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {

@RequestMapping("/even_odd")
    public String EvenOdd(@RequestParam int number) {

        if (number%2== 0) {

            return "Given number is Even number :" + number;
        } else {
            return "Given number is odd number :" + number;
        }
    }
    @RequestMapping("/add")
    public String addition(@RequestParam int a, @RequestParam int b){

    return "addition of two number:"+(a+b);

    }

    @RequestMapping("/sub")
public String subtraction(@RequestParam int a, @RequestParam int b){


    return "subtraction of two number :"+(a-b);
}

@RequestMapping("/multi")
public String multiple(@RequestParam int a, @RequestParam int b){

    return "multiple of two number :"+(a*b);
}
@RequestMapping("/division")
public String division (@RequestParam double a, @RequestParam double b){

    return "division of two number:"+(a/b);
}

}