package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Test {
	private Integer id;
	private String isbn;
	private String title;
	private Integer  price;
	private String  published;
	
	private  List<Integer> i = new ArrayList<>();
	private  List<String> is = new ArrayList<>();
	private  List<String> ti = new ArrayList<>();
	private  List<Integer> pr = new ArrayList<>();
	private  List<String> pu = new ArrayList<>();
	//private  List<Date> date = new ArrayList<>();
	
	
	public Test() {
		i.add(0120);
		is.add("test");
		ti.add("つらたん");
		pr.add(100);
		pu.add( "テスト");
		i.add(1120);
		is.add("Rtest");
		ti.add("tつらたん");
		pr.add(2100);
		pu.add( "テスト");

		
	}
	

	public List<Integer> getI() {
		return i;
	}

	public void setI(List<Integer> i) {
		this.i = i;
	}

	public List<String> getIs() {
		return is;
	}

	public void setIs(List<String> is) {
		this.is = is;
	}

	public List<String> getTi() {
		return ti;
	}

	public void setTi(List<String> ti) {
		this.ti = ti;
	}

	public List<Integer> getPr() {
		return pr;
	}

	public void setPr(List<Integer> pr) {
		this.pr = pr;
	}

	public List<String> getPu() {
		return pu;
	}

	public void setPu(List<String> pu) {
		this.pu = pu;
	}

	public Integer getId(int i) {
		return this.i.get(i);
	}
	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIsbn(int i) {
		return this.is.get(i);
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle(int i) {
		return this.ti.get(i);
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getPrice(int i) {
		return this.pr.get(i);
	}
	
	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getPublished(int i) {
		return this.pu.get(i);
	}
	
	public String getPublished() {
		return published;
	}

	public void setPublished(String published) {
		this.published = published;
	}

}
