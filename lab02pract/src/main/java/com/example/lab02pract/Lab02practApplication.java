package com.example.lab02pract;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class Lab02practApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab02practApplication.class, args);
		ApplicationContext ac = new ClassPathXmlApplicationContext("conf.xml");
		Department d = (Department) ac.getBean("dept");
		College c = (College) d.getCollege();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.Enter Department Details\n2.Get Department Details\n3.Exit");
			System.out.print("Enter your choice:");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the Department Name:");
				d.setDName(sc.next());
				System.out.println("Enter the Department id");
				d.setDid(sc.nextInt());
				System.out.println("Details are inserted successfully");
				break;
			case 2:
				System.out.println("Dept Details");
				System.out.println("Dept Name: "+d.getDName());
				System.out.println("Dept Id: "+d.getDid());
				System.out.println("College Details");
				System.out.println("College id: "+c.getCid());
				System.out.println("College Address: "+c.getCAddress());
				System.out.println("College name: "+c.getCName());
				break;
			case 3:
				System.exit(0);
				break;
			}
			
		}

	}

}
