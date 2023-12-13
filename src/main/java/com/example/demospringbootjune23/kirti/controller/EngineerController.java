package com.example.demospringbootjune23.kirti.controller;
import com.example.demospringbootjune23.kirti.controller.model.Engineer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class EngineerController {

    ArrayList<Engineer> engineersArrayList = new ArrayList<>();

    @RequestMapping("/add_Engineers/{name}/{age}/{dpt}")
    public Engineer addEngineer(@PathVariable String name, @PathVariable int age , @PathVariable String dpt,double salary ){

        Engineer engineer = new Engineer( name,age,dpt,salary);

        engineersArrayList.add(engineer);

        return engineer;
    }

    @RequestMapping("/add_all_Engineer")

    public ArrayList<Engineer> getEngineerArrayList(){
        engineersArrayList.add(new Engineer("Lalit",22,"Software",25000.0));
        engineersArrayList.add(new Engineer("Rohan",24,"Hardware",30000.0));
        engineersArrayList.add(new Engineer("Lalit",26,"Mechanical",35000.0));
        engineersArrayList.add(new Engineer("Mohit",28,"Devloper",45000.0));

        return engineersArrayList;
    }
    @RequestMapping("/update_engineer")
    public String updateEngineer(@RequestParam String name, @RequestParam int index){

        // get students object

        Engineer engineer= engineersArrayList.get(index);//updated
        engineer.setName(name);
        engineersArrayList.set(index,engineer);
        return "Engineer update_record successfully";
    }
    @RequestMapping("remove_engineer/{index}")
    public String removeEngineer(@PathVariable int index){
        engineersArrayList.remove(index);
        return "Record deleted";
    }
}


