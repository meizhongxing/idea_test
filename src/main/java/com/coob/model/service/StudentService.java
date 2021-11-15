package com.coob.model.service;

import com.coob.model.dao.StudentDao;
import com.coob.model.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {

    public int insert(Student student);
    public int update(Student student);
    public int deleteBySid(Integer sid);
    public Student selectBySid(Integer sid);
    public List<Student> selectByParams(Map<String, Object> params);
}
