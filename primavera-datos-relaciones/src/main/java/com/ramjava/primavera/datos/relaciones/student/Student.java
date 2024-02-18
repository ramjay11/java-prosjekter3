package com.ramjava.primavera.datos.relaciones.student;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import javax.security.auth.Subject;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;
    @JsonIgnore @ManyToMany
    private Set<Subject> subjects = new HashSet<>();

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

}
