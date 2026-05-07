package org.tuapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tuapp.model.Estudiante;
import org.tuapp.service.EstudianteService;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService service;

    // Endpoint para guardar (POST: http://localhost:8080/api/estudiantes)

    @PostMapping

    public Estudiante crear(@RequestBody Estudiante estudiante) {
        return service.guardarEstudiante(estudiante);
    }

    // Endpoint para listar (GET: http://localhost:8080/api/estudiantes)

    @GetMapping
    public List<Estudiante> listarTodos() {
        return service.obtenerTodos();
    }

}

