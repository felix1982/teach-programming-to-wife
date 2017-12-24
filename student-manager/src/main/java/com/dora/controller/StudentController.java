package com.dora.controller;

import com.dora.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017-12-24.
 */
@Controller
public class StudentController {
    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/add")
    public String addStudent(){
        return "addstudent";
    }

    @RequestMapping(value = "/doAdd")
    public String doAdd(Student student, Model model){
        String[] sList = student.getName().split(",");
       for(int i=0;i<sList.length;i++){
           System.out.println(sList[i]);
       }
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
