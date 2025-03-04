package com.shinnal.spring.ex.jpa.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@AllArgsConstructor
@Getter
@Setter
public class Student {
	
	private int id;
	private String name;
	private String phoneNumber;
	private String email;
	private String dreamJob;
	LocalDateTime createdAt;
	LocalDateTime updatedAt;
	
	
	
}
