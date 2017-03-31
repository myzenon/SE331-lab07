package camt.cbsd.services;

import camt.cbsd.dao.StudentDao;
import camt.cbsd.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;



@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao studentDao;
    public List<Student> getStudents(){

        return studentDao.getStudents();
    }

    @Override
    public Student findById(long id) {
        return studentDao.findById(id);
    }

    @Override
    public Student addStudent(Student student) {
        return studentDao.addStudent(student);
    }
}
