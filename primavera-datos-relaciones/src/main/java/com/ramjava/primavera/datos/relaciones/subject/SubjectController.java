package com.ramjava.primavera.datos.relaciones.subject;

import com.ramjava.primavera.datos.relaciones.student.Student;
import com.ramjava.primavera.datos.relaciones.student.StudentRepository;
import com.ramjava.primavera.datos.relaciones.teacher.TeacherRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subjects")
public class SubjectController {
    private SubjectRepository subjectRepository;
    private StudentRepository studentRepository;
    private TeacherRepository teacherRepository;

    public SubjectController(SubjectRepository subjectRepository, StudentRepository studentRepository, TeacherRepository teacherRepository) {
        this.subjectRepository = subjectRepository;
        this.studentRepository = studentRepository;
        this.teacherRepository = teacherRepository;
    }
    @GetMapping
    List<Subject> getSubjects() {
        return subjectRepository.findAll();
    }
    @PostMapping
    Subject createSubject(@RequestBody Subject subject) {
        return subjectRepository.save(subject);
    }
    @PutMapping("/{subjectId}/students/{studentId}")
    Subject addStudentToSubject(@PathVariable Long subjectId, @PathVariable Long studentId) {
        Subject subject = subjectRepository.findById(subjectId).get();
        Student student = studentRepository.findById(studentId).get();
        subject.enrolledStudents.add(student);
        return subjectRepository.save(subject);
    }

}
