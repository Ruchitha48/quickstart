package com.example.demo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
        Student st=ctx.getBean("student1",Student.class);
        System.out.println(st);
        ctx.close();
        }
}
