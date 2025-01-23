package com.yedam;

import java.util.Scanner;

public class Todo3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String[][] friendsAry = new String[100][3];
		friendsAry[0] = new String[] { "홍길동", "010-1111-1111", "남" };
		friendsAry[1] = new String[] { "이민영", "010-2222-2222", "여" };
		friendsAry[2] = new String[] { "최지현", "010-3333-3333", "남" };
		boolean run = true;
		while (run) {
			System.out.println("1.목록 2.등록 3.조회 9.종료");
			System.out.print("선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:
				for (int i = 0; i < friendsAry.length; i++) {
						if (friendsAry[i] != null && friendsAry[i][0] != null) {
							System.out.printf("이름: %s  번호: %s  성별: %s\n",friendsAry[i][0],friendsAry[i][1],friendsAry[i][2]);
						}
					
				}
				break;

			case 2: // 입력
				System.out.print("이름을 입력>> ");
				String name = scn.nextLine();
				System.out.print("연락처를 입력>> ");
				String phone = scn.nextLine();
				System.out.print("성별을 입력>> ");
				String gender = scn.nextLine();

				// 등록하기
				for (int i = 0; i < friendsAry.length; i++) {
					// 빈값을 판단하기
					if (friendsAry[i] != null && friendsAry[i][0] == null) {
						friendsAry[i] = new String[] {name, phone, gender};
						break;
					}
				}
				System.out.println("등록이 완료되었습니다!");
				break;

			case 3: // 조회(성별)
				System.out.print("이름을 입력하세요");
				String searchName = scn.nextLine();
				String searchGd = "";
				for (int i = 0; i < friendsAry.length; i++) {
					if (friendsAry[i][0].equals(searchName)) {
						searchGd = friendsAry[i][2];
						System.out.printf("%s의 성별은 %s입니다.", searchName, searchGd);
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
		}

	}
}
