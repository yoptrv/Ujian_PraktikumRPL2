/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ujian__dio_50422434.controller;

import com.mycompany.ujian__dio_50422434.model.ToDo;
import com.mycompany.ujian__dio_50422434.service.ToDoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ToDoController {

    @Autowired
    private ToDoService service;

    public void add(ToDo t) {
        service.add(t);
    }

    public List<ToDo> getAll() {
        return service.getAll();
    }

    public void delete(Long id) {
        service.delete(id);
    }

    public void update(ToDo t) {
        service.update(t);
    }
}