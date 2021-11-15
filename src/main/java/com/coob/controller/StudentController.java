package com.coob.controller;

import com.coob.model.entity.Student;
import com.coob.model.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/selectAll")
    public String selectAll(String sname, String sex, String address, Model model){
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("sname", sname);
        params.put("sex", sex);
        params.put("address", address);

        List<Student> list = this.studentService.selectByParams(params);
        model.addAttribute("list", list);

        return null;
    }
}
