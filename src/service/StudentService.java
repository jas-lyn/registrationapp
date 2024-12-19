package service;

import model.Course;
import model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentService {
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent(Student student) {    //subscribeStudent
        students.put(student.getId(), student);
    }

    //findStudent
    public Student findStudent(String studentId) {
        if (students.containsKey(studentId)) {
            return students.get(studentId);
        }
        return null;
    }


    public void enrollStudentToCourse(String studentId, Course course) {    //enrollStudentToCourse

        if (students.containsKey(studentId)) {            //Check that the student exists before enrolling him/her to a course
            students.get(studentId).enrollToCourse(course);   //enroll students to course
        }
    }

    public boolean isSubscribed(String studentId){        //Check if the student is subscribed
        return students.containsKey(studentId);
    }
    public void showSummary() {                         //Show summary of
        //TODO
    }
}