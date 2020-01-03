package com.deloitte.library.bookservices;

import java.awt.List;
import java.util.ArrayList;

import com.deloitte.library.model.Library;

public interface BookInterface {
		public void addBooks(String bookid, String bookname,String bookauthor, String price);
		public ArrayList<Library> displayAllBooks();
		public ArrayList<Library> searchBook(String bookName);
		public void deleteBook(String bookId);
}
