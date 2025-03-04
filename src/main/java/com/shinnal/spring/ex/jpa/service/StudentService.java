package com.shinnal.spring.ex.jpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shinnal.spring.ex.jpa.domain.Student;
import com.shinnal.spring.ex.jpa.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Student addStudent(
			String name
			, String phoneNumber
			, String email
			, String dreamJab) {
		
		Student student = Student.builder()
				.name(name)
				.phoneNumber(phoneNumber)
				.email(email)
				.dreamJob(dreamJab)
				.build();
		
		Student result = studentRepository.save(student);
		
		return result;
	}
	
	
	public Student updateStudent(int id, String dreamJob) {
		// 수정 대상 행을 조회 한다.
		// 조회 결과를 객체로 얻어오기
		// 객체에 수정사항을 적용
		// 수정된 객체를 저장한다.
		
		
		// Optional
		// null 일수도 있는 객체를 null을 처리하는 기능으로 감싸놓은 객체
		// null을 다룰때 발생되는 NullPointerException 위험을 줄여주기 위한 용도
		// null일수도 있는 return의 경우: return 타입으로 주로 사용
		Optional<Student> optionalStudent = studentRepository.findById(id);
		
		Student student = optionalStudent.orElse(null);
		
		student = student.toBuilder().dreamJob(dreamJob).build();
		
		Student result = studentRepository.save(student);
		
		return result;
		
	}
	
	
	public void deleteStudent(int id) {
		// 삭제대상을 조회한다.
		// 조회된 행의 정보로 삭제 한다.
		
		Optional<Student> optionalStudent = studentRepository.findById(id);
		
		Student student = optionalStudent.orElse(null);
		
		studentRepository.delete(student);
		
		
	}
	
	
	
	
	
	
}
