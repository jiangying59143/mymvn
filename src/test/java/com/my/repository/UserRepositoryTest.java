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
        User user = new User("jiang", 18);
        userRepository.insert(user);
        sqlSession.commit();
        System.out.println(user);
    }

    @Test
    public void findAll() {
        System.out.println(userRepository.findAll());
    }

    @Test
    public void findById() {
        User user = new User("jiang", 18);
        System.out.println(userRepository.insert(user));
        sqlSession.commit();
        System.out.println(userRepository.findById(user.getId()));
    }

    @Test
    public void findById2() {
        User user = new User("jiang", 18);
        System.out.println(userRepository.insert(user));
        sqlSession.commit();
        System.out.println(userRepository.findById2(user.getId()));
    }

    @Test
    public void findByUserAndAge() {
        User user = new User("jiang", 18);
        System.out.println(userRepository.insert(user));
        sqlSession.commit();
        System.out.println(userRepository.findByUserAndAge("jiang", 18));
    }

    @Test
    public void findByUserAndAge2() {
        User user = new User("jiang", 18);
        System.out.println(userRepository.insert(user));
        sqlSession.commit();
        System.out.println(userRepository.findByUserAndAge2("jiang", 18));
    }

    @Test
    public void deleteById() {
        User user = new User("jiang", 18);
        System.out.println(userRepository.insert(user));
        sqlSession.commit();
        System.out.println(userRepository.findById(user.getId()));
        userRepository.deleteById(user.getId());
        System.out.println(userRepository.findById(user.getId()));
    }

    @Test
    public void update() {
        User user = new User("jiang", 18);
        System.out.println(userRepository.insert(user));
        sqlSession.commit();
        System.out.println(userRepository.findById(user.getId()));
        System.out.println(userRepository.update(new User(user.getId(), "jiangshen", null)));
        sqlSession.commit();
        System.out.println(userRepository.findById(user.getId()));
    }
}
