package com.demo;

public class Book {
	
	private int book_id;
	private String book_name;
	
	public Book() {}
	public Book(int book_id,String book_name) {
		this.book_id=book_id;
		this.book_name=book_name;
	}
	
	public int getBook_id() {
		return book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
