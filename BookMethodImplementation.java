package com.deloitte.library.bookservices;

import java.awt.List;
import java.util.ArrayList;

import com.deloitte.library.dao.BooksDAO;
import com.deloitte.library.exception.BookNameException;
import com.deloitte.library.model.Library;
import com.deloitte.library.utility.BookUtilities;

public class BookMethodImplementation implements BookInterface {
	     Library lb = new Library();
	@Override
	public void addBooks(String bookid, String bookname, String bookauthor, String price) {
		// TODO Auto-generated method stub

		lb.setBookid(Integer.parseInt(bookid));
		lb.setBookname(bookname);
		lb.setBookauthor(bookauthor);
		lb.setPrice(Integer.parseInt(price));
		BooksDAO.addBook(lb);
		
	}

	@Override
	public ArrayList<Library> displayAllBooks() {
		// TODO Auto-generated method stub
		 return BooksDAO.displayAllBooks();

	}

	@Override
	public ArrayList<Library> searchBook(String bookName ) {
		// TODO Auto-generated method stub
		
		return BooksDAO.searchBook(bookName);
	}

	@Override
	public void deleteBook(String bookId) {
		// TODO Auto-generated method stub
		BooksDAO.deleteBook(bookId);
	}

}
