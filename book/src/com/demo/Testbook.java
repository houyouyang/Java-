  package com.demo;

public class Testbook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book []books= {
				new Book(1,"java�������"),
				new Book(2,"��ҳ���"),
				new Book(3,"C#�������"),
				new Book(4,"UI���"),
				new Book(5,"��ѧӢ��"),
				new Book(6,"C++�������"),
		};
		Book_Method book_method=new Book_Method();
		System.out.println("=========����ͼ��չʾ===========");
		book_method.showAll(books);
		System.out.println("����ݲ�����ʾ���в���ѡ��:");
		book_method.borrowBook(books);

	}

}
