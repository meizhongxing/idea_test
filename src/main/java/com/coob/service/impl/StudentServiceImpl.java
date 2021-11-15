package com.coob.service.impl;

import com.coob.model.dao.StudentDao;
import com.coob.model.entity.Student;
import com.coob.model.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    public int insert(Student s){
        return this.studentDao.insert(s);
    }

    public int update(Student s){
        return this.studentDao.update(s);
    }

    public int deleteBySid(Integer sid){
        return this.studentDao.deleteBySid(sid);
    }

    public Student selectBySid(Integer sid) {
        return this.studentDao.selectBySid(sid);
    }

    public List<Student> selectByParams(Map<String, Object> params) {
        return null;
    }
}
