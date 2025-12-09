/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ujian__dio_50422434;

import com.mycompany.ujian__dio_50422434.controller.ToDoController;
import com.mycompany.ujian__dio_50422434.view.ToDoView;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ToDoApp {

    public static void main(String[] args) {

        // Swing jangan headless (bisa error kalo ga ada GUI)
        System.setProperty("java.awt.headless", "false");

        // Start Spring Boot
        ApplicationContext ctx = SpringApplication.run(ToDoApp.class, args);

        // Ambil controller dari Spring container
        ToDoController controller = ctx.getBean(ToDoController.class);

        // Jalankan Swing UI di EDT (biar ga glitch)
        javax.swing.SwingUtilities.invokeLater(() -> {
            new ToDoView(controller).setVisible(true);
        });
    }
}