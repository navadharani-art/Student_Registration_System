package com.example.webapp.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity 
@Table(name="SD")
public class Student {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY) 
private Long id;
private String  studentname;
private String dept;
private String regno;
public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getStudentname() {
    return studentname;
}
public void setStudentname(String studentname) {
    this.studentname = studentname;
}
public String getDept() {
    return dept;
}
public void setDept(String dept) {
    this.dept = dept;
}
public String getRegno() {
    return regno;
}
public void setRegno(String regno) {
    this.regno = regno;
}
}

