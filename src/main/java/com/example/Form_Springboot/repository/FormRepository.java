package com.example.Form_Springboot.repository;

import com.example.Form_Springboot.entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormRepository extends JpaRepository<Form, Long> {

}
