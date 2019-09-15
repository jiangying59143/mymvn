package com.my.repository;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class ClassesRepositoryTest {

    SqlSession sqlSession;

    ClassesRepository classesRepository;

    SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        InputStream inputStream = ClassesRepositoryTest.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
        classesRepository = sqlSession.getMapper(ClassesRepository.class);
    }

    @Test
    public void findById() {
        System.out.println(classesRepository.findById(1));
        sqlSession.close();

        sqlSession = sqlSessionFactory.openSession();
        classesRepository = sqlSession.getMapper(ClassesRepository.class);
        System.out.println(classesRepository.findById(1));
    }
}
