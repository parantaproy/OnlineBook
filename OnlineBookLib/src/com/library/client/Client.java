package com.library.client;

import java.util.*;

import com.library.bean.ListBook;
import com.library.exceptions.*;
import com.library.service.*;

public class Client {

	public static void print(List<ListBook> book) {
		for (ListBook b : book) {
			System.out.println(b);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		IBook ibook = new BookImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Get all books");
		System.out.println("2. Get books by author");
		System.out.println("3. Get books by category");
		System.out.println("Enter your choice : ");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			print(ibook.Deserialize());
			break;
		case 2:
			System.out.println("Enter author");
			try {
				print(ibook.getBookByAuthor(sc.next()));
			} catch (AuthorNotFound e) {
				System.out.println(e.getMessage());
			}
			break;
		case 3:
			System.out.println("Enter category");
			try {
				print(ibook.getBookByCategory(sc.next()));
			} catch (CatNotFound e) {
				System.out.println(e.getMessage());
			}
			break;
		default:
			System.out.println("Enter valid choice");
		}
		sc.close();
	}

}
