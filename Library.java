package com.deloitte.library.model;

public class Library {
		private static int bookid;
		private String bookname;
		private String bookauthor;
		private int price;
		private static int counter;
		public Library() {
			counter++;
		}
		public static int getCounter() {
			return counter;
		}
		public static void setCounter(int counter) {
			Library.counter = counter;
		}
		static {
			counter=1001;
		}
		public int getBookid() {
			return bookid;
		}
		public void setBookid(int bookid) {
			this.bookid =bookid;
		}
		public String getBookname() {
			return bookname;
		}
		public void setBookname(String bookname) {
			this.bookname = bookname;
		}
		public String getBookauthor() {
			return bookauthor;
		}
		public void setBookauthor(String bookauthor) {
			this.bookauthor = bookauthor;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Library [bookid id="+bookid +"bookname=" + bookname + ", bookauthor=" + bookauthor + ", price=" + price + "]";
		}
		
}
