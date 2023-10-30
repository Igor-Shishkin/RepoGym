package com.example.springbootsecurity.student;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {
    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "James Bond"),
            new Student(2, "Maria Jones"),
            new Student(3, "Anna Smith")
    );
    //@PreAuthorize() przyjmuje:
    // - "hasRole('ROLE_ADMIN')" ,
    // - "hasAnyRole('ROLE_ADMIN', 'ROLE_STUDENT')",
    // - "hasAuthority('student:read')", - "hasAnyAuthority('student:read','student:write')
    //STUDENT(Sets.newHashSet()),
    //    ADMIN(Sets.newHashSet(COURSE_READ, COURSE_WRITE, STUDENT_READ, STUDENT_WRITE)),
    //    ADMINTRAINEE
    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_ADMINTRAINEE')")
    public List<Student> getAllStudents(){
        System.out.println("getAllStudents");
        return STUDENTS;
    }
    @PostMapping
    @PreAuthorize("hasAuthority('student:write')")
    public void registerNewStudent(@RequestBody Student student){
        System.out.println("registerNewStudent: " + student);
    }
    @DeleteMapping("{studentId}")
    @PreAuthorize("hasAuthority('student:write')")
    public void deleteStudent(@PathVariable Integer studentId){
        System.out.println("deleteStudent by id: " + studentId);
    }
    @PutMapping("{studentId}")
    @PreAuthorize("hasAuthority('student:write')")
    public void updateStudent(@PathVariable Integer studentId, @RequestBody Student student){
        System.out.println("updateStudent");
        String.format("%s %s", studentId, student);
    }

    @GetMapping("/guest/{name}")
    @PreAuthorize("hasAuthority('guest:read')")
    public void welcomeGuest(@PathVariable String name){
        System.out.println("Witaj drogi " + name);
    }
}
