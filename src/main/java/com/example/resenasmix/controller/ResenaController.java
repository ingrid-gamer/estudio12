package com.example.resenasmix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.resenasmix.model.Resena;
import com.example.resenasmix.service.ResenaService;

@RestController
@RequestMapping("/resenas")
public class ResenaController {

    @Autowired
    private ResenaService service;

    @GetMapping
    public List<Resena> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Resena obtener(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public Resena guardar(@RequestBody Resena r) {
        return service.guardar(r);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}