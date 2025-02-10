package com.yedam.stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 학생정보 관리 프로그램 v.1
 * 학생이름, 키, 몸무게, 점수
 */
public class StudentApp {
	Scanner scn = new Scanner(System.in);
	boolean run = true;

	// 임시저장
	List<Student> students = new ArrayList<>();

	public StudentApp() {
		init(); // 초기값
	}

	public void start() {
		while (run) {
			System.out.println("1.목록 2.추가 3.삭제 9.종료");
			System.out.println("선택>> ");

			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1:
				studentList();
				break;
			case 2:
				addStudent();
				break;
			case 3:
				removeStudent();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				save();
			}
		}
		System.out.println("end of prog.");
	} // end of start

	public void studentList() {
		// 이름 점수
		// ---------
		// 홍길동 90
		System.out.println(" 이름   점수");
		System.out.println(" ---------");

		for (Student std : students) {
			System.out.println(" " + std.getName() + "   " + std.getScore() + "");
		}
	}

	public void addStudent() {
		System.out.print("학생 이름 입력>> ");
		String name = scn.nextLine();
		System.out.print("학생 키 입력>> ");
		Double height = Double.parseDouble(scn.nextLine());
		
		System.out.print("학생 몸무게 입력>> ");
		Double weight = Double.parseDouble(scn.nextLine());
		System.out.print("학생 점수 입력>> ");
		int score = Integer.parseInt(scn.nextLine());

		students.add(new Student(name, height, weight, score));
		System.out.println("등록완료.");

	} // end of addStudent()

	public void removeStudent() {
		System.out.println("학생 이름 입력>> ");
		String name = scn.nextLine();

		// 삭제
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(name)) {
				students.remove(i);
				System.out.println("삭제완료.");
			}
		}
	} // end of removeStudent()

	public void save() {
		// c:/temp/studenList.txt
		try {
			Writer writer = new FileWriter("c:/temp/studenList.txt");
			// 갯수만큼 반복저장
			for (Student std : students) {
				writer.write(
						std.getName() + " " + std.getHeight() + " " + std.getWeight() + " " + std.getScore() + "\n");
			}
			writer.flush();
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("saved.");

	} // end of save()

	// 파일 읽어서 컬렉션 저장
	public void init() {
		// c:/temp/studenList.txt
		try {
			Reader reader = new FileReader("c:/temp/studenList.txt");
			BufferedReader br = new BufferedReader(reader);

			while (true) {
				String str = br.readLine();
				if (str == null)
					break;
				String[] ary = str.split(" "); // {이름, 키, 몸무게, 점수}
				Student student = new Student(ary[0] // 이름
						, Double.parseDouble(ary[1]) // 키
						, Double.parseDouble(ary[2]) // 몸무게
						, Integer.parseInt(ary[3])); // 점수

				students.add(student); // 컬렉션 추가
			}
			br.close();
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//end
