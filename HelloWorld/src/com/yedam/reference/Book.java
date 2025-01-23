package com.yedam.reference;

public class Book {
	
	String bookName;
	String bookWriter;
	String bookCompany;
	int bookPrice;
	
	Book(){		
	}
	
	Book(String bookName, String bookWriter, String bookCompany, int bookPrice){
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.bookCompany = bookCompany;
		this.bookPrice = bookPrice;	
	}
	
	void bookInfo() {
		System.out.printf("도서명: %s  저자: %s  출판사: %s  가격: %d\n", bookName, bookWriter, bookCompany, bookPrice);
		
	}
}
