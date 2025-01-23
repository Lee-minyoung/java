package com.yedam.reference;

import java.util.Scanner;

/*
 * 도서명, 저자, 출판사, 판매가격 >>
 */
public class BookExe {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		Book[] bookRepository = new Book[100];
		
		Book book1 = new Book();
		book1.bookName = "봄";
		book1.bookWriter = "홍길동";
		book1.bookCompany = "A";
		book1.bookPrice = 1000;
		
		Book book2 = new Book();
		book2.bookName = "여름";
		book2.bookWriter = "김길동";
		book2.bookCompany = "B";
		book2.bookPrice = 2000;
		
		Book book3 = new Book();
		book3.bookName = "가을";
		book3.bookWriter = "박길동";
		book3.bookCompany = "C";
		book3.bookPrice = 3000;
		
		Book book4 = new Book();
		book4.bookName = "겨울";
		book4.bookWriter = "최길동";
		book4.bookCompany = "D";
		book4.bookPrice = 4000;


		bookRepository[0] = book1;
		bookRepository[1] = book2;
		bookRepository[2] = book3;
		bookRepository[3] = book4;
		
		boolean run = true;		
		
		//1.전체목록 2.도서등록 3.조회(출판사) 9.종료
		while(run) {
			System.out.println("1.전체목록 2.도서등록 3.조회 9.종료");
			System.out.print("선택하세요> ");
			int menu = Integer.parseInt(scn.nextLine());
			
			switch(menu) {
		
			case 1:
				for(int i=0; i<bookRepository.length; i++) {
					if(bookRepository[i] != null) {
						bookRepository[i].bookInfo();
						}
				}
				break;
			
				case 2:
				System.out.println("등록할 도서의 도서명을 입력하세요.");
				String bookName = scn.nextLine();
				System.out.println("등록할 도서의 저자을 입력하세요.");
				String bookWriter = scn.nextLine();
				System.out.println("등록할 도서의 출판사를 입력하세요.");
				String bookCompany = scn.nextLine();
				System.out.println("등록할 도서의 가격을 입력하세요.");
				String bookPrice = scn.nextLine();
				
				
				
			
			System.out.println("등록 완료되었습니다!");
				break;
				
	
			case 3:
				for(int i=0; i<bookRepository.length; i++) {
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

