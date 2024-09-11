package com.example.session1semana2.controllers;

import com.example.session1semana2.models.Persona;
import com.example.session1semana2.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private Repository repo;

    @GetMapping
    public String index(){
        return "Conectado a la base de datos";
    }

    @GetMapping("personas")
    public List<Persona> getPersonas(){
        return repo.findAll();
    }

    @PostMapping("grabar")
    public String post(@RequestBody Persona persona){
        repo.save(persona);
        return "Grabado";
    }

    @PutMapping("editar/{id}")
    public String update(@PathVariable Long id, @RequestBody Persona persona){
        Persona updatePersona = repo.findById(id).get();
        updatePersona.setNombre(persona.getNombre());
        updatePersona.setApellido(persona.getApellido());
        updatePersona.setEdad(persona.getEdad());
        updatePersona.setDni(persona.getDni());
        repo.save(updatePersona);
        return "Actualizado";
    }

    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable Long id){
        Persona deletePersona = repo.findById(id).get();
        repo.delete(deletePersona);
        return "Eliminado";
    }

}
