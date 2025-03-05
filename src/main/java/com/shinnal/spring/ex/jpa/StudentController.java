package com.shinnal.spring.ex.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shinnal.spring.ex.jpa.domain.Student;
import com.shinnal.spring.ex.jpa.repository.StudentRepository;
import com.shinnal.spring.ex.jpa.service.StudentService;

@RequestMapping("/jpa/student")
@Controller
public class StudentController {
	
	
	@Autowired
	StudentService studentService;
	
	// 경고!!
	// 절대 Controller에서 Repository를 직접 사용하면 안됨!!
	// 단, 예제 진행 편의를 위해 사용하는 것!
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	@ResponseBody
	@GetMapping("/create")
	public Student createStudent() {
		// 김인규, 010-1234-5678, lecture@hagulu.com, 개발자
		Student student = studentService.addStudent("김인규", "01012345678", "lecture@hagulu.com", "개발자");
		
		return student;
		
	}
	
	@ResponseBody
	@GetMapping("/update")
	public Student updateStudent() {
		// id가 3인 학생의 장래희망을 강사로 변경
		
		Student student = studentService.updateStudent(3, "강사"); // (id, 바꿀내용)
		
		return student;
	}
	
	
	@ResponseBody
	@GetMapping("/delete")
	public String deleteStudent() {
		// id가 3인 학생정보 삭제
		studentService.deleteStudent(3);
		
		return "삭제 성공!";
		
	}
	
	@ResponseBody
	@GetMapping("/find")
	public List<Student> findStudent() {
		
		List<Student> studentList = null;
		// 모든 행 조회
//		List<Student> studentList = studentRepository.findAll(); // 모든 리스트 조회
//		studentList = studentRepository.findAllByOrderByIdDesc(); // 내림차순으로 모든 리스트 조회
//		studentList = studentRepository.findTop2ByOrderByIdDesc(); // 위에서 두개만 조회
//		studentList = studentRepository.findByName("김인규"); // 전달받은 이름 조회
		
//		List<String> nameList = new ArrayList<>(); // 전달받은 이름들(리스트) 조회
//		nameList.add("김인규");
//		nameList.add("유재석");
//		
//		studentList = studentRepository.findByNameIn(nameList);
		
//		studentList = studentRepository.findByEmailContaining("naver"); // 파라미터 단어가 포함된 리스트 조회
		
//		studentList = studentRepository.findByIdBetweenOrderByIdDesc(2, 4); // 원하는 id 사이에 있는 리스트 조회
		
		studentList = studentRepository.selectByDreamJob("개발자"); // 쿼리 작성해서 원하는 변수가 포함된 리스트 조회
			
		return studentList;
		
	}
	
	
	@ResponseBody
	@GetMapping("/jpa/lombok")
	public Student lombokTest() {
		
//		Student student = new Student(4, "김인규", "010-1234-5678", "lecture@hagulu.com", "프로그래머", null, null);
//		student.setDreamJob("강사");
//		student.setPhoneNumber("010-1111-2222");
		
		// builder 패턴
		
		Student student = Student.builder()
				.name("김인규")
				.phoneNumber("010-1234-5678")
				.dreamJob("개발자")
				.build();
		
		
		return student;
		
	}
	
	
}
