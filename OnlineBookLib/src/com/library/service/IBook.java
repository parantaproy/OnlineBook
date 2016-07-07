package com.library.service;
import com.library.bean.*;
import com.library.exceptions.AuthorNotFound;
import com.library.exceptions.CatNotFound;

import java.util.*;
public interface IBook {

void addBook(ListBook books);

List<ListBook> getAllBooks();
List<ListBook> getBookByAuthor(String s) throws AuthorNotFound;
List<ListBook> getBookByCategory(String s) throws CatNotFound;

void Serialize();
List<ListBook> Deserialize();






}


