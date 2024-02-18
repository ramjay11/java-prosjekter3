package com.ramjava.primavera.datos.relaciones.subject;

import com.ramjava.primavera.datos.relaciones.student.Student;
import com.ramjava.primavera.datos.relaciones.teacher.Teacher;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

public class Subject {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;
    @ManyToMany
    @JoinTable(name = "students_enrolled",
            joinColumns = @JoinColumn(name = "subject_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    Set<Student> enrolledStudents = new HashSet<>();
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_id", referencedColumnName = "id")
    private Teacher teacher;
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
