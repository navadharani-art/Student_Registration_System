package com.example.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.webapp.domain.Student;
import com.example.webapp.repository.StudentRepository;

@Controller

public class LoginController {
    @Autowired 
    StudentRepository repo;
@GetMapping("/signin")
public String ShowLoginPage(){
    return "login.html";
}
@PostMapping("/signin")
public String Login(@RequestParam String studentname, String dept){
    Student entity = repo.findByStudentnameAndDept(studentname, dept);
    if(entity == null) {
        return "redirect:/login.html";
    }
    return "redirect:/dashboard.html";
}
@GetMapping ("/logout")
public String Logout() {
    return "redirect:/index.html";
}
}