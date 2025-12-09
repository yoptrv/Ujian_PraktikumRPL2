/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ujian__dio_50422434.service;

import com.mycompany.ujian__dio_50422434.model.ToDo;
import com.mycompany.ujian__dio_50422434.repository.ToDoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository repo;

    public void add(ToDo t) {
        repo.save(t);
    }

    public List<ToDo> getAll() {
        return repo.findAll();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public void update(ToDo t) {
        repo.save(t);
    }
}