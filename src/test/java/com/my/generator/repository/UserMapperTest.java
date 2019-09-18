/*
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

    SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        InputStream inputStream = ClassesRepositoryTest.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    */
/**
     * 懒加载测试 只针对不同mapper文件，同一个mapper文件还是会全部打印出来
     *//*

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

    */
/**
     * mybatis一级和二级 缓存测试
     *//*

    @Test
    public void selectByPrimaryKey2() {
        User user = userMapper.selectByPrimaryKey(1);

        System.out.println("----------------------------");
        System.out.println(user);
        sqlSession.close();

        sqlSession = sqlSessionFactory.openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
        User user2 = userMapper.selectByPrimaryKey(1);
        System.out.println(user2);

        //如果设置二级缓存第二条sout会报错
        System.out.println(user.getClasses());
        System.out.println(user2.getClasses());
    }

}*/
