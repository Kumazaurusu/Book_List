package com.example.demo;

import java.time.LocalDate;

import org.hibernate.validator.constraints.ISBN;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@NotBlank(message = "入力してください")
	@ISBN
	private String isbn;

	@NotBlank(message = "入力してください")
	private String title;

	@NotNull(message = "入力して")
	@Min(0)
	private Integer  price;

	@NotBlank(message = "入力してください")
	private String  publisher;
	@Column(name="published")
	@NotNull(message = "入力してください")
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate date;
	/*
	public Book() {
		this.id = 0120;
		this.isbn = "test";
		this.title =  "つらたん";
		this.price =  100;
		this.published = "テスト";
		
	}*/

}