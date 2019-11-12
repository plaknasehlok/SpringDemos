package com.example.demo;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;  
  
public class Test {  
    public static void main(String[] args) {  
    	
    	AbstractApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
          
		/*
		 * Resource r=new ClassPathResource("bean.xml"); BeanFactory factory=new
		 * XmlBeanFactory(r);
		 */ 
          
		/* Employee s=(Employee)factory.getBean("e"); */ 
    	Employee s=(Employee)context.getBean("e");
        s.display();        
    }  
}