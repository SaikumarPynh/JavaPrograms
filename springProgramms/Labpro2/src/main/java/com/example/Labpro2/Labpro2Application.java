package com.example.Labpro2;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SpringBootApplication
public class Labpro2Application {

	public static void main(String[] args) {
		SpringApplication.run(Labpro2Application.class, args);
		Scanner sc = new  Scanner(System.in);
		 //ApplicationContext ac = new ClassPathXmlApplicationContext("CollDep.xml");
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("CollDep.xml");
		Department d = (Department) ac.getBean("department");
		College c = (College) d.getCollege_info();
		while(true) {
			System.out.println("1.Enter the Details \n2.Display the  Details \n 3.Exit");
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
				
			switch(choice) {
			case 1:
					System.out.println("Enter Department Details:");
					System.out.println("Name:");
					d.setDepartment_name(sc.next());
					System.out.println("Address:");

					d.setDepartment_address(sc.next());
					break;
			case 2:
				System.out.println("Department Details");
				System.out.println("Name :" + d.getDepartment_name());
				System.out.println("Address :" + d.getDepartment_address());
				System.out.println("College Details");
				System.out.println("Name:" + c.getCollege_name());
				System.out.println("Address"+c.getCollege_address());
				break;
			case 3:
				System.out.println("Exiting");
				System.exit(0);
			default:
				System.out.println("invalid choice");
				
			}
		}
	}
	
}
