package com.my.generator.repository;

import com.my.generator.domain.User;
import com.my.generator.domain.UserCourse;
import com.my.repository.ClassesRepositoryTest;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

public class UserMapperTest {

    SqlSession sqlSession;

    UserMapper userMapper;

    @Before
    public void setUp() throws Exception {
        InputStream inputStream = ClassesRepositoryTest.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void selectByPrimaryKey() {
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);
        System.out.println(user.getUserCourses());
        System.out.println(user.getClasses());
        System.out.println(user.getClasses().getUsers());
        for (UserCourse userCours : user.getUserCourses()) {
            System.out.println(userCours.getCourse());
        }
    }
}