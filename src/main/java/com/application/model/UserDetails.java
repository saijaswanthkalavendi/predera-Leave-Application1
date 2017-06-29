package com.application.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;


@Entity
@Table(name="LeaveDetails")

@Component
public class UserDetails{
	
			 @Id
			 @GeneratedValue(strategy=GenerationType.AUTO)
			 @Column(name="id")
		     private int id;
			
			 @NotNull
			 @Size(min=4,max=15,message="Empid must be manditory")
			 @Column(name="Empid", unique=true)
		     private String Empid;
			 
			 
			 @NotNull
			 @Size(min=11,max=35,message="Emp name is manditory")
			 @Column(name="Empname")
		     private String Empname;
			 
			 
					 
			 @NotNull
			 @Size(min=6,max=15,message="Please enter your department")
			 @Column(name="dept")
		     private String dept; 
			 
			 
			 @NotNull
			 @Size(min=50,max=100,message="please enter start date of leave")
			 @Column(name="startdate")
		     private String sd;
			 
			 @NotNull
			 @Size(min=50,max=100,message="please enter start date of leave")
			 @Column(name="enddate")
		     private String ed;
			 
			 
			 			
}
               


			