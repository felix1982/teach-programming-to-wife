package com.dora.controller;

import com.dora.entity.Student;
import com.dora.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017-12-24.
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/index")
    public String indexPage(Model model){
        model.addAttribute("students",studentService.getAll());
        return "index";
    }

    @RequestMapping(value = "/add")
    public String addPage(){
        return "addstudent";
    }

    @RequestMapping(value = "/doAdd")
    public String doAdd(Student student, Model model) {
        studentService.save(student);
        model.addAttribute("students",studentService.getAll());
        return "index";
    }

    @RequestMapping(value = "/update")
    public String updateStudent(){
      return "modifystudent";
    }

    @RequestMapping(value = "/detail")
    public String studentDetail(){
      return "studentdetail";
    }
}
