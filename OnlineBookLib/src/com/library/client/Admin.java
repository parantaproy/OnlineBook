package com.library.client;

import java.util.Scanner;

import com.library.bean.*;
import com.library.service.*;

public class Admin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		IBook bookref = new BookImpl();

		for (int i = 0; i < 2; i++) {
			System.out.println("Enter book details :-");
			ListBook book = new ListBook();
			System.out.println("Enter title : ");
			book.setTitle(sc.next());
			System.out.println("Enter author : ");
			book.setAuthor(sc.next());
			System.out.println("Enter category : ");
			book.setCategory(sc.next());

			bookref.addBook(book);

		}
		bookref.Serialize();

		/*
		 * try { System.out.println("saving the books to a file."); } catch
		 * (Exception e) { e.printStackTrace(); }
		 */

		sc.close();
	}

}
