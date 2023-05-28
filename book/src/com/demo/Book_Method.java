package com.demo;

import java.util.Scanner;

public class Book_Method {
	Scanner sc = new Scanner(System.in);
	public void borrowBook(Book[]books) {
		int userIn = 0;
		int bookBh = 0;
		int isBorrow = 0;
		
		while(true) {
			System.out.println("是否进入借书页面:");
			System.out.println("1:进入,2:不进入");
			try {
				userIn = getUserInput();
			}catch(BookException e) {
				System.out.println("您输入的信息有误,请重新输入!");
				continue;
			}
			if(userIn==2) {
				System.out.println("已经退出图书管理系统。");
				break;
			}
			while(true) {
				System.out.println("请输入图书编号:");
				try {
					bookBh=getUserBookBh(books);
				}catch (BookException e) {
					System.out.println("图书系统中没有这本书，请重新选择。");
					continue;
				}
				bookBh-=1;
				System.out.println("你要借的图书是:"+books[bookBh].getBook_name());
				
				while(true) {
					System.out.println("是否要借阅这本书：");
					System.out.println("1:借阅,2:不借阅");
					try {
						isBorrow=getUserInput();
					}catch(BookException e) {
						System.out.println("您输入的信息有误，请重新输入。");
						continue;
					}
					if(isBorrow==1)
						System.out.println("您已成功借阅此书，书名为:"+books[bookBh].getBook_name());
					else
						System.out.println("已经取消 对:"+books[bookBh].getBook_name()+"该书的借阅。");
					
					while(true) {
						System.out.println("是否继续借书:");
						System.out.println("1:继续借书，2:不继续借书");
						try {
							isBorrow=getUserInput();
						}catch(BookException e) {
							System.out.println("您输入的信息有误，请重新输入!");
							continue;
						}
						break;
					}
					break;
				}
				if(isBorrow==1) continue;
				if(isBorrow==2) {
					System.out.println("您已经退出操作系统");
					break;
				}
			}
			break;
		}
	}
	
	public void showAll(Book[]books) {
		for(int i=0;i<books.length;i++) {
			System.out.println("编号:"+books[i].getBook_id()+"\t"+"书名:"+books[i].getBook_name());
		}
	}
	public int getUserInput()throws BookException{
		int userIn=sc.nextInt();
		if(userIn!=1&&userIn!=2) {
			throw new BookException();
		}
		return userIn;
	}
	public int getUserBookBh(Book[]books)throws BookException {
		int bookBh=sc.nextInt();
		if(!isExist(books,bookBh)) {
			throw new BookException();
		}
		return bookBh;
	}
	public boolean isExist(Book[]books,int bookBh) {
		for(int i=0;i<books.length;i++) {
			if(bookBh==books[i].getBook_id()) {
				return true;
			}
		}
		return false;
	}
	
	public int getYserIsBorrow()throws BookException{
		int isBorrow=sc.nextInt();
		if(isBorrow!=1&& isBorrow!=2) {
			throw new BookException();
		}
		return isBorrow;
	}

}
