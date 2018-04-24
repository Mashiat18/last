package controller;

import data.model.Student;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "studentController")
@SessionScoped
public class StudentController {
    Student student = new Student();

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
     public String isNextPage(){
        return "success";
     }
    public String isNextPage2(){
        return "success2";
    }
    public String isNextPage3(){
        return "success3";
    }
}
