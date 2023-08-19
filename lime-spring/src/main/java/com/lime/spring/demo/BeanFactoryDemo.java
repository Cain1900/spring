package com.lime.spring.demo;


import com.lime.spring.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by YuHang on 2023/8/18.
 */
public class BeanFactoryDemo {

    public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Student student = (Student) applicationContext.getBean("student");
        System.out.println(student.getName());
    }
}
