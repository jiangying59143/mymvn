/*
package com.my.generator.repository;

import com.my.generator.domain.Classes;
import com.my.repository.ClassesRepositoryTest;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

public class ClassesMapperTest {
    SqlSession sqlSession;

    ClassesMapper classesMapper;

    @Before
    public void setUp() throws Exception {
        InputStream inputStream = ClassesRepositoryTest.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
        classesMapper = sqlSession.getMapper(ClassesMapper.class);
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    */
/**
     * 测试懒加载
     *//*

    @Test
    public void selectByPrimaryKey() {
        Classes classes = classesMapper.selectByPrimaryKey(1);
        System.out.println(classes);
        System.out.println(classes.getUsers());
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void insertBatchSelective() {
    }

    @Test
    public void updateBatchByPrimaryKeySelective() {
    }
}*/
