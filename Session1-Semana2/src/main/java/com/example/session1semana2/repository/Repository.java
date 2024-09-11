package com.example.session1semana2.repository;

import com.example.session1semana2.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Persona, Long> {
}
