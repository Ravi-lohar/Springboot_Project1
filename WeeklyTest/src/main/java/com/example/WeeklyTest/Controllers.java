package com.example.WeeklyTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {
    @Autowired
    Car c ;

    @PostMapping("car")
    public void printCar(@RequestBody Car c){
        System.out.println(c);
 }

    @PostMapping("testing")
    public void printEmployee(@RequestBody Employee e)
    {
        System.out.println(e);
    }

}
