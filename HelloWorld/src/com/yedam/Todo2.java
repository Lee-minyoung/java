package com.yedam;

import java.util.Scanner;

/*
 * 친구정보관리 앱 v.1
 * 이름,연락처,성별(남/여) -> 홍길동,010-1234-5678,남
 * 1. 목록(이름,연락처,성별) 2.등록 3.조회(성별) 4.삭제(이름) 9.종료
 * String[] friendAry 크기는 100개;
 */
public class Todo2 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		String[] friendsAry = new String[100];
		friendsAry[0]="홍길동,010-1234-5678,남";
		
		boolean run = true;
		while (run) {
			System.out.println("1.목록 2.등록 3.조회 4.삭제 5.수정 9.종료");
			System.out.print("선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:
				for (int i = 0; i < friendsAry.length; i++) {
					if(friendsAry[i] != null) {
					System.out.println(friendsAry[i]);
					}
				}
				break;

			case 2:
				System.out.print("이름,연락처,성별을 입력하세요.");
				
				for (int i = 0; i < friendsAry.length; i++) {
					if(friendsAry[i] == null) {
						friendsAry[i] = scn.nextLine();
						break;
					}
				}
				break;
				
				
			case 3:
				System.out.print("이름을 입력하세요");
				String searchName = scn.nextLine();
				for (int i = 0; i < friendsAry.length; i++) {
					if (friendsAry[i] != null) {
						if (friendsAry[i].split(",")[0].equals(searchName)) {
							System.out.println("존재합니다.");
							break;
						}

					} else {
						System.out.print("존재하지 않습니다.");
						break;
					}

					// System.out.println(studentAry[i].split(",")[0].equals(searchName));
				}

				break;

			case 4:
					System.out.print("삭제할 이름을 입력하세요.");
					String delName = scn.nextLine();
					for(int i=0; i<friendsAry.length; i++) {
						if (friendsAry[i] != null) {
						if(friendsAry[i].split(",")[0].equals(delName)) {
							friendsAry[i] = null;
						}
				}}
					break;
					
			case 5:
				System.out.print("수정할 사람의 이름을 입력하세요");
				String editName = scn.nextLine();
				System.out.print("수정할 번호를 입력하세요");
				String editPhone = scn.nextLine();
				for(int i=1; i < friendsAry.length; i++) {
					if(friendsAry[i] != null) {
						if(friendsAry[i].split(",")[0].equals(editName)) {
							friendsAry[i].split(",")[1] = null;
							friendsAry[i].split(",")[1] = editPhone;
							
						}
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
