package com.ramjava.primavera.datos.relaciones.teacher;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ramjava.primavera.datos.relaciones.subject.Subject;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Set;

public class Teacher {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonIgnore
    @OneToMany(mappedBy = "teacher")
    private Set<Subject> subjects;
    private String name;
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
        return this.subjects;
    }
}
