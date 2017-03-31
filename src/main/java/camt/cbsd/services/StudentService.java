package camt.cbsd.services;

import camt.cbsd.entity.Student;

import java.util.List;

/**
 * Created by Dto on 3/11/2017.
 */
public interface StudentService {
    List<Student> getStudents();
    Student findById(long id);
    Student addStudent(Student student);
}
