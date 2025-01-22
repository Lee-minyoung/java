package com.yedam;

import java.util.Scanner; //ctrl+shift+O

//com.yedam.Todo
public class Todo {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); //system.in -> 시스템의 기본 입력장치
		int balance = 0; //예금액
		int money = 0; //입금액,출금액 담아놓을 변수

		while(true) {
			System.out.println("1.입금 2.출금 3.잔액조회 4.종료");
			System.out.print("메뉴을 선택하세요> ");		
			int num = Integer.parseInt(scn.nextLine()); //문자타입반환 -> int 반환 / nextLine -> 문자열로 읽어주는
			
			if(num == 1) { //입금
				System.out.print("입금액을 입력> ");
				balance = Integer.parseInt(scn.nextLine());
				
				if(balance + money > 100000) {
					System.out.println("금액초과입니다.");
				}
				else{
					money += balance;
					System.out.println("입금완료.");}
			}
			else if(num == 2) { //출금
				System.out.print("출금액을 입력> ");
				balance = Integer.parseInt(scn.nextLine());
				if(money>balance) {
					money -= balance;
				}
				else {
					System.out.println("출금할 금액부족");
				}
			}
			else if(num == 3) { //잔액조회
				System.out.printf("현재 잔액은 %d입니다.\n", money);
			}
			else if(num == 4) { //종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		//System.out.printf("end of prog\n");
	}

}
