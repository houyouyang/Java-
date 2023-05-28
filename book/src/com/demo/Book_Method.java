package com.demo;

import java.util.Scanner;

public class Book_Method {
	Scanner sc = new Scanner(System.in);
	public void borrowBook(Book[]books) {
		int userIn = 0;
		int bookBh = 0;
		int isBorrow = 0;
		
		while(true) {
			System.out.println("�Ƿ�������ҳ��:");
			System.out.println("1:����,2:������");
			try {
				userIn = getUserInput();
			}catch(BookException e) {
				System.out.println("���������Ϣ����,����������!");
				continue;
			}
			if(userIn==2) {
				System.out.println("�Ѿ��˳�ͼ�����ϵͳ��");
				break;
			}
			while(true) {
				System.out.println("������ͼ����:");
				try {
					bookBh=getUserBookBh(books);
				}catch (BookException e) {
					System.out.println("ͼ��ϵͳ��û���Ȿ�飬������ѡ��");
					continue;
				}
				bookBh-=1;
				System.out.println("��Ҫ���ͼ����:"+books[bookBh].getBook_name());
				
				while(true) {
					System.out.println("�Ƿ�Ҫ�����Ȿ�飺");
					System.out.println("1:����,2:������");
					try {
						isBorrow=getUserInput();
					}catch(BookException e) {
						System.out.println("���������Ϣ�������������롣");
						continue;
					}
					if(isBorrow==1)
						System.out.println("���ѳɹ����Ĵ��飬����Ϊ:"+books[bookBh].getBook_name());
					else
						System.out.println("�Ѿ�ȡ�� ��:"+books[bookBh].getBook_name()+"����Ľ��ġ�");
					
					while(true) {
						System.out.println("�Ƿ��������:");
						System.out.println("1:�������飬2:����������");
						try {
							isBorrow=getUserInput();
						}catch(BookException e) {
							System.out.println("���������Ϣ��������������!");
							continue;
						}
						break;
					}
					break;
				}
				if(isBorrow==1) continue;
				if(isBorrow==2) {
					System.out.println("���Ѿ��˳�����ϵͳ");
					break;
				}
			}
			break;
		}
	}
	
	public void showAll(Book[]books) {
		for(int i=0;i<books.length;i++) {
			System.out.println("���:"+books[i].getBook_id()+"\t"+"����:"+books[i].getBook_name());
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
