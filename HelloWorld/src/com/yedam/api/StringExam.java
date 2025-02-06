package com.yedam.api;

public class StringExam {
	public static void main(String[] args) {
	// 문제호출
		연습();
		no1();
		no2();
		no3();
}
	
	static void 연습() {
		String str = "hello";
		String str1 = "world";
	}
	
	static void no1() {
		//"9803061234123" "991112 2341234"주민등록번호의 성별
		String ssn1 = "9803061234123";
		String ssn2 = "991112 2341234";
		String ssn3 ="021112-3341234"; //8번째 값이 성별 
		StringUtil.checkGender(ssn3);
	}
	
	static void no2() {
		//파일경로와 파일명
		String file1 ="C:/temp/flower.jpg";
		String file2 ="D:/web/project/guide.mp3";
		StringUtil.checkExtesion(file2);
	}
	
	static void no3() {
		//문자의 갯수를 반환
		String str1 = " suggest ";
		String str2 = " currently ";
		String str3 = " particular ";
		StringUtil.getLength(str3);
	}
}
