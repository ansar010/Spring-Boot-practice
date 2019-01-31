package com.bridgelabz.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgelabz.aop.service.ShapeServices;

public class AopMain
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("springAop.xml");
		ShapeServices shapeServices = context.getBean("shape",ShapeServices.class);
		System.out.println(shapeServices.getCircle().getName());
		System.out.println(shapeServices.getOval().getName());
		System.out.println(shapeServices.getTriangle().getName());

		ClassPathXmlApplicationContext c=(ClassPathXmlApplicationContext) context;
		c.close();
		//((ClassPathXmlApplicationContext) context).close();
		}
}
