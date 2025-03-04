package com.shinnal.spring.ex.jpa.domain;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder(toBuilder=true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name="`student_info`")
@Entity
public class Student {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@Column(name="phoneNumber")
	private String phoneNumber;
	private String email;
	
	@Column(name="dreamJob")
	private String dreamJob;
	
	@Column(name="createdAt")
	@CreationTimestamp
	LocalDateTime createdAt;
	
	@Column(name="updatedAt")
	@UpdateTimestamp
	LocalDateTime updatedAt;
	
	
	
}
