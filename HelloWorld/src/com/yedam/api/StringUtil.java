package com.yedam.api;

public class StringUtil {

	static void 연결하기(String str, String str2) {
		// 문자열을 연결하는 메소드 ""+""+""
		System.out.println(str.concat(", ").concat(str2));
	}

	static void checkGender(String ssn) {
		// 성별을 출력. "남자입니다" 또는 "여자입니다"
		char gender = ssn.charAt(7);
		switch (gender) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;

		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		default:
			System.out.println("알 수 없음");
		}
	}

	static void checkExtesion(String file) {
		// 파일의 확장자는 jpg (또는 mp3, hwp)입니다.
		String ext = file.substring(file.indexOf(".")+1);
		System.out.printf("파일의 확장자는 %s 입니다\n",ext);
	}
	
	static void getLength(String str) {
		// 문장의 길이는 7글자 입니다.
		int len = str.trim().length();
		System.out.printf("문장의 길이는 %d글자입니다.", len);
//		String ssn=str;
//		int length = ssn.length();
//		System.out.printf("문장의 길이는 %d글자입니다.", length-2);
	}
} // end of StringUtil
