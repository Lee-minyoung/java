package com.yedam;

import java.util.Scanner;

public class Todo3 {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);

	String[][] friendsAry = new String[100][3];
	
	boolean run = true;
	while (run) {
		System.out.println("1.목록 2.등록 3.조회 4.삭제 5.수정 9.종료");
		System.out.print("선택하세요> ");
		int menu = Integer.parseInt(scn.nextLine());

		switch (menu) {
		case 1:
			for (int i = 0; i < friendsAry.length; i++) {
				
			}
			System.out.println("==========================");
			break;

		case 2: //입력
			System.out.println("이름을 입력>> ");
			String name = scn.nextLine();
			System.out.println("연락처를 입력>> ");
			String phone = scn.nextLine();
			System.out.println("성별을 입력>> ");
			String gender = scn.nextLine();
			
			//등록하기
			for (int i = 0; i < friendsAry.length; i++) {
				name = friendsAry[0][i];
				phone = friendsAry[1][i];
				gender = friendsAry[2][i];
				}
			System.out.println("등록이 완료되었습니다!");
			break;
			
			
		case 3: //조회(성별)
			System.out.print("이름을 입력하세요");
			String searchName = scn.nextLine();
			String searchGender ="";
			for (int i = 0; i < friendsAry.length; i++) {
				if(friendsAry[0][i] == searchName) {
					searchName=friendsAry[0][i];
					searchGender=friendsAry[2][i];
					}
				System.out.printf("%s의 성별은 %s입니다.", searchName, searchGender);
			}
			break;

		case 4:
				System.out.print("삭제할 이름을 입력하세요.");
				String delName = scn.nextLine();
				for(int i=0; i<friendsAry.length; i++) {
					
				}
				break;
				
		case 5:
			System.out.print("수정할 사람의 이름을 입력하세요");
			String editName = scn.nextLine();
			System.out.print("수정할 번호를 입력하세요");
			String editPhone = scn.nextLine();
			for(int i=1; i < friendsAry.length; i++) {
				if(friendsAry[i] != null) {
					
				}
			}
				
		case 9:
			System.out.println("프로그램을 종료합니다.");
			run = false;
			break;

		default:
			System.out.println("메뉴를 다시 선택하세요.");
		}
	}

}
}
