  package com.demo;

public class Testbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book []books= {
				new Book(1,"java程序设计"),
				new Book(2,"网页设计"),
				new Book(3,"C#程序设计"),
				new Book(4,"UI设计"),
				new Book(5,"大学英语"),
				new Book(6,"C++程序设计"),
		};
		Book_Method book_method=new Book_Method();
		System.out.println("=========所有图书展示===========");
		book_method.showAll(books);
		System.out.println("请根据操作提示进行操作选择:");
		book_method.borrowBook(books);

	}

}
