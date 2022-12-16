package com.spring_boot.projectTeam.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BorrowVO_b {
	private String bNo;
	private String bookId;
	private String memId;
	private String bookState;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date bdate;
	private String bookName;
	private String bookImg;
	private String bookAuthor;
	private String bookPublish;
	private int bookPrice;
	private int rentP;
	private String rentB;
	
	public String getRentB() {
		return rentB;
	}
	public void setRentB(String rentB) {
		this.rentB = rentB;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getBookImg() {
		return bookImg;
	}
	public void setBookImg(String bookImg) {
		this.bookImg = bookImg;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPublish() {
		return bookPublish;
	}
	public void setBookPublish(String bookPublish) {
		this.bookPublish = bookPublish;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public int getRentP() {
		return rentP;
	}
	public void setRentP(int rentP) {
		this.rentP = rentP;
	}
	public String getbNo() {
		return bNo;
	}
	public void setbNo(String bNo) {
		this.bNo = bNo;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookState() {
		return bookState;
	}
	public void setBookState(String bookState) {
		this.bookState = bookState;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
}
