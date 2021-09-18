package com.example.Form_Springboot.controller;


import com.example.Form_Springboot.entity.Form;
import com.example.Form_Springboot.repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@RestController
public class FormController {

    @Autowired
    FormRepository formRepository;

    @GetMapping("/form")
    public List<Form> getAllData() {
        return formRepository.findAll();
    }

    @PostMapping("/form")
    public Form saveCourse(@RequestBody Form newForm) { return formRepository.save(newForm); }

}
