package com.deepu;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.deepu.entity.Employee1;
import com.deepu.repo.myrepo;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private myrepo repo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	    // Employee1 e1=new Employee1(101, "shashi",50000.42);
	    // Employee1 e2=new Employee1(102, "pavan",10000.62);
	    // Employee1 e3=new Employee1(103, "naresh",60000.42);
	    // Employee1 e4=new Employee1(104, "vijay",80000.62);
	     //repo.save(e1);
	     //repo.save(e2);
	   //  repo.save(e3);
	     //repo.save(e4);
	     System.out.println("records created");
	     System.out.println("get one record");
	    // Employee1 getOne =repo.findById(104).get();
	     
	    //System.out.println(getOne);
	     /*System.out.println("Get All Records");
	     List<Employee1>listofemployee=(List<Employee1>) repo.findAll();
	     System.out.println(listofemployee);*/
	     /*System.out.println("Delete Student Record");
	     repo.deleteById(101);
	     System.out.println("One Record deleted");*/
	     System.out.println("One Record update");
	     Employee1 oldRecord =repo.findById(102).get();
	     Employee1 newData = new Employee1();
         newData.setEmpname("rajashekar");
         newData.setEmpsalary(90000.42);
         oldRecord.setEmpname( newData.getEmpname());
         oldRecord.setEmpsalary( newData.getEmpsalary());
         repo.save(oldRecord);
         System.out.println("One Record updated successfully");
         
	     
	     
	     
	     
	     
	     
		
		
	}

}
