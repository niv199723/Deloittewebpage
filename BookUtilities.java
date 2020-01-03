package com.deloitte.library.utility;

import com.deloitte.library.exception.BookNameException;

public class BookUtilities {
	
	
		public static boolean nameValidation(String bookName) throws BookNameException {
			String pattern="^[A-Za-z]+$";
			if(!bookName.matches(pattern)) {
				throw new BookNameException("Name can have only alphabets");
			}
			return false;
		}
}
