package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity //it converts class to the entity class
@Data
@Table(name="employees") //it specifies the table in the databade with which this entity is mapped
public class Employee {
	
	@Id //primary key of the entity
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name ="first_name", nullable=false)
	private String firstname;
	
	@Column(name ="lastname")
	private String lastname;
	
	@Column(name ="email")
	private String email;
	 

}
