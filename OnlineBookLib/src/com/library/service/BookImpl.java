package com.library.service;
import com.library.bean.*;
import com.library.exceptions.AuthorNotFound;
import com.library.exceptions.CatNotFound;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookImpl implements IBook{

	ArrayList<ListBook> book=new ArrayList<ListBook>();

	@Override
	public void addBook(ListBook books) {
		// TODO Auto-generated method stub
		book.add(books);
	}

	@Override
	public List<ListBook> getAllBooks() {
		// TODO Auto-generated method stub
		return Deserialize();
	}

	@Override
	public List<ListBook> getBookByAuthor(String s) throws AuthorNotFound {
		// TODO Auto-generated method stub
		List<ListBook> book=Deserialize();
		List<ListBook> temp=new ArrayList<ListBook>();
		for (ListBook b : book) {
			if ((b.getAuthor()).equalsIgnoreCase(s)) {
				temp.add(b);
			}
		}
		if (temp.size() == 0)
			throw new AuthorNotFound("Author not found");
		return temp;
	}

	@Override
	public List<ListBook> getBookByCategory(String s) throws CatNotFound {
		// TODO Auto-generated method stub
		List<ListBook> book=Deserialize();
		List<ListBook> temp=new ArrayList<ListBook>();
		for (ListBook b : book) {
			if ((b.getAuthor()).equalsIgnoreCase(s)) {
				temp.add(b);
			}
		}
		if (temp.size() == 0)
			throw new CatNotFound("Category not found");
		return temp;
		
	}

	@Override
	public void Serialize() {
		// TODO Auto-generated method stub
		FileOutputStream fs = null;
		ObjectOutputStream os = null;
		try {
			fs = new FileOutputStream("testbook.ser");
			os = new ObjectOutputStream(fs);
			os.writeObject(book);
			System.out.println("Before Serialization :-");
			System.out.println(book);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(os != null) 
					os.close();
				if(fs != null)
					fs.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	}
	@Override
	public List<ListBook> Deserialize() {
		// TODO Auto-generated method stub
		FileInputStream fs = null;
		ObjectInputStream os = null;

		try {
			fs = new FileInputStream("testbook.ser");
			os = new ObjectInputStream(fs);
			book = (ArrayList<ListBook>)os.readObject();
			System.out.println("Deserializing book \n" + book);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (ClassCastException e) {
			e.printStackTrace();
		} finally {
			try {
				fs.close();
				os.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return book;
		
	}

	
	
}	