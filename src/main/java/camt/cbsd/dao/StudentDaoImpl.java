package camt.cbsd.dao;


import camt.cbsd.entity.Student;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dto on 3/15/2017.
 */
@Profile("firstDataSource")
@ConfigurationProperties(prefix="server")
@Repository
public class StudentDaoImpl extends AbstractStudentDao {

    @PostConstruct
    private void init(){
        imageBaseUrl = baseUrl + imageUrl;;
       students = new ArrayList<>();

        Student student = new Student(1,"SE-001","Mitsuha","Miyamizu",
                2.15,imageBaseUrl+"mitsuha.gif",true,0,
                "The most beloved one");
        students.add(student);
        student = new Student(2,"SE-002","Prayuth","The minister",
                3.59,imageBaseUrl+"tu.jpg",false,15,
                "The great man ever!!!!");
        students.add(student);
        student = new Student(3,"SE-003","Jurgen","Kloop",
                2.15,imageBaseUrl+"Kloop.gif",true,2,
                "The man for the Kop");
        students.add(student);
    }

    @Override
    public Student addStudent(Student student) {
        if(students.add(student)) {
            return student;
        }
        return null;
    }
}
