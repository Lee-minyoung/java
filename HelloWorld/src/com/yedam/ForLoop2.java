package com.yedam;

import java.util.Scanner;

public class ForLoop2 {

	public static void main(String[] args) {
//		String[] infoAry = "홍길동,80,85".split(",");
//		System.out.println(infoAry[0]);
//		System.out.println(infoAry[1]);
//		System.out.println(infoAry[2]);

//		String[] infoAry = "홍길동, 80".split(",");
//		System.out.println(infoAry[0]);
//		System.out.println(Integer.parseInt("80") * Integer.parseInt("70"));

		/*
		 * String[] strAry = new String[10]; strAry[0] = "홍길동"; String name = "김길동"; for
		 * (int i = 0; i < strAry.length; i++) { if (strAry[i] == null) { //빈공간에 등록 후
		 * 반복문 종료 strAry[i] = name; break; } }
		 * 
		 * for (int i = 0; i < strAry.length; i++) { if (strAry[i] != null) {
		 * System.out.println(strAry[i]); } }
		 */

		Scanner scn = new Scanner(System.in);
		/*
		 * System.out.println("이름,점수 값을 입력"); String userVal = scn.nextLine(); String[]
		 * infoAry = userVal.split(",");
		 * 
		 * System.out.printf("이름은 %s이고 점수는 %s입니다.", infoAry[0], infoAry[1]);
		 */
		String[] studentAry = new String[100];

		// 2~4번
		studentAry[0] = "홍길동,80";
		studentAry[1] = "김민수,70";
		studentAry[2] = "박우식,85";

		boolean run = true;

		while (run) {
			System.out.println("1.학생이름,점수 2.최고점수 3.학생입력(단건) 4.조회(이름) 5.수정 9.종료");
			System.out.print("선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {

			case 1:
				for (int i = 0; i < studentAry.length; i++) {
					
					System.out.print("이름,점수를 입력하세요.");
					studentAry[i] = scn.nextLine();
				}
				System.out.println("등록완료!");
				break;

			case 2:
				int max = 0;
				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] != null) { // null값이 아닐 경우 아래코드 실행
						int temp = Integer.parseInt(studentAry[i].split(",")[1]);
						if (max < temp) {
							max = temp;
						}
					}
				}
				System.out.printf("최고점수는 %d\n", max);
				break;

			case 3:
				System.out.print("이름,점수를 입력하세요");

				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] == null) {
						studentAry[i] = scn.nextLine();
						break;
					}
				}

				break;

			case 4:
				System.out.print("이름을 입력하세요");
				String searchName = scn.nextLine();
				for (int i = 0; i < studentAry.length; i++) {
					if (studentAry[i] != null) {
						if (studentAry[i].split(",")[0].equals(searchName)) {
							System.out.println("존재");
							break;
						}
					}else {
						System.out.print("존재X");
						break;
					}
				}
				
				break;
			
			

			case 9:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;

			default:
				System.out.println("메뉴를 다시 선택하세요.");

			}

		} // end of while
		System.out.println("end of prog.");

		/*
		 * for(int i=0; i<studentAry.length; i++) { System.out.println(studentAry[i]);
		 * //"null" != null }
		 */
	} // end of main
}// end of class
