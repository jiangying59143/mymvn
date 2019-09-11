package com.my.repository;

import com.my.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Test {
    public static void main(String[] args) {
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserRepository userRepository = sqlSession.getMapper(UserRepository.class);
//        User user = new User("jiang", 18);
//        System.out.println(userRepository.insert(user));
//        System.out.println(user.getId());
//        sqlSession.commit();

        System.out.println(userRepository.findAll());
        User user2 = userRepository.findById(2);
        System.out.println(userRepository.findById2(2));
        System.out.println(user2);
        System.out.println(userRepository.update(user2));
        System.out.println(userRepository.findById(2));
        System.out.println(userRepository.deleteById(3));
        sqlSession.commit();
        System.out.println(userRepository.findByUserAndAge("jiang", 18));
        System.out.println(userRepository.findByUserAndAge2("jiang", 18));
    }
}
