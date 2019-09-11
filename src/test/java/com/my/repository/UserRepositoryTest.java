package com.my.repository;

import com.my.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class UserRepositoryTest {
    SqlSession sqlSession;

    UserRepository userRepository;

    @Before
    public void setUp() throws Exception {
        InputStream inputStream = UserRepositoryTest.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
        userRepository = sqlSession.getMapper(UserRepository.class);
    }

    @Test
    public void insert() {
    }

    @Test
    public void findAll() {
    }

    @Test
    public void findById() {
    }

    @Test
    public void findById2() {
    }

    @Test
    public void findByUserAndAge() {
    }

    @Test
    public void findByUserAndAge2() {
    }

    @Test
    public void deleteById() {
    }

    @Test
    public void update() {
        System.out.println(userRepository.findById(2));
        System.out.println(userRepository.update(new User(2, "jiangshen", null)));
        sqlSession.commit();
        System.out.println(userRepository.findById(2));
    }
}
