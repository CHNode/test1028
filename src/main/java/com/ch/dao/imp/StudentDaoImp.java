package com.ch.dao.imp;

import com.ch.dao.StudentDao;
import com.ch.domain.Student;
import com.ch.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDaoImp implements StudentDao {

    @Override
    public int insertStudent(Student student) {
        return 0;
    }

    @Override
    public List<Student> selectStudents() {
        SqlSession session = MyBatisUtils.getSqlSession();
        String sqlId="com.ch.dao.StudentDao.selectStudents";
        List<Student> students = session.selectList(sqlId);
        session.close();
        return students;
    }
}
