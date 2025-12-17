package com.example.demo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.entity.Studententity;
import com.example.demo2.service.Studentservice;

@RestController
public class StudentcController {
    @Autowired
    Studentservice src;
    @PatchMapping("/post")
    public Studententity postdata(@RequestBody Studententity st){ //to show the only one data
        return src.savedata(st);
    }
    @GetMapping("/get")
    // list used to retrive all the data
    public List<Studententity> getdata(){
        return src.retdata();
    }
    @GetMapping("/getid/{id}")
    //particular details only taken @PathVariable is used to work for {id} 
    public Studententity getIdVal(@PathVariable int id){
        return src.id(id);
    }
    @PutMapping("/update/{id}")
    public Studententity funName (@PathVariable int id,@RequestBody Studententity st){
      
        return src.id(id,st);

    }
    @DeleteMapping("/delete/{id}")
    public Studententity deleteData(@PathVariable int id){ 
       return src.ideas(id);
        
    }
}