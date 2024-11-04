package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
	Model model;
	private BookRepository rep;

	@Autowired
	public BookController(BookRepository rep) {
		this.rep = rep;
	}

	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("list", rep.findAll());
		return "view";
	}

	@GetMapping("/calc")
	public String getBook(Model model) {
		Test test = new Test();
		List<Book> bk = new ArrayList<Book>();
		for (int i = 0; i < test.getIs().size(); i++) {
			Book b = new Book();
			b.setId(test.getId(i));
			b.setIsbn(test.getIsbn(i));
			b.setPrice(test.getPrice(i));
			b.setPublisher(test.getPublished(i));
			b.setTitle(test.getTitle(i));
			//b.setDate(new Date(2020 - 1900, 1 - 1, 1));
			bk.add(b);
		}
		model.addAttribute("list", bk);
		return "form";
	}

//	@GetMapping("/cleate")
//	public String PostBook() {
//		return "create";
//
//	}

}
