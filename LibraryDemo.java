package com.deloitte.library.main;

import java.util.Scanner;

import com.deloitte.library.bookservices.BookMethodImplementation;
import com.deloitte.library.exception.BookNameException;
import com.deloitte.library.model.Library;
import com.deloitte.library.utility.BookUtilities;

import java.util.ArrayList;
import java.util.List;
public class LibraryDemo {
	public static void main(String[] args) {
		Scanner scr =new Scanner(System.in);
		ArrayList<Library> bookslist = new ArrayList<Library>();
		while(true) {
		System.out.println("Please enter 1 to add new book"
		+" option 2 to display"
		+" option 3 to search"		
		+" option 4 exit");
		BookMethodImplementation bookMethodimpl = new BookMethodImplementation();
		
		String option =scr.next();

		switch(option) {
		case "1":
			
			System.out.println("Enter book id");
			String bookid = scr. next();
			String bookname="";
			while(true) {
			System.out.println("Enter book name");
			bookname= scr. next();
			try {
				BookUtilities.nameValidation(bookname);
				break;
			} catch (BookNameException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			}
			System.out.println("Enter book author");
			String bookauthor = scr.next();
			System.out.println("Enter price of the book");
			String price = scr.next();
		    bookMethodimpl.addBooks(bookid, bookname, bookauthor, price);
			
			break;
			
		case "2":
			bookslist=bookMethodimpl.displayAllBooks();
			for(Library lbobj:bookslist) {
				System.out.println(lbobj);
				
			}
			break;
			
		case "3":
			System.out.println("Enter book name");
			String bookName = scr. next();
			bookslist=bookMethodimpl.searchBook(bookName);
			for(Library lbobj:bookslist) {
				System.out.println(lbobj);
				
			}
		case "4":
			System.out.println("Enter bookid");
			String bookId = scr. next();
			bookMethodimpl.deleteBook(bookId);
		case "5":
			System.exit(0);
				
		}
		}
		
		
	}
}
