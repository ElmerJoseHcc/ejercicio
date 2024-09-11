package com.example.session1semana2.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    @Getter
    private long id;
    @Column
    @Setter
    @Getter
    private String nombre;
    @Column
    @Setter
    @Getter
    private String apellido;
    @Column
    @Setter
    @Getter
    private String edad;
    @Column
    @Setter
    @Getter
    private String dni;
}
