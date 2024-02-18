package com.ramjava.primavera.datos.relaciones.teacher;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
    private TeacherRepository teacherRepository;

    public TeacherController(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }
    @GetMapping
    List<Teacher> getTeachers() {
        return teacherRepository.findAll();
    }
    @PostMapping
    Teacher createTeacher(@RequestBody Teacher teacher) {
        return teacherRepository.save(teacher);
    }
}
