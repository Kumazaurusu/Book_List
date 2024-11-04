package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CrudController {
	private BookRepository rep;

	@Autowired
	public CrudController(BookRepository rep) {
		this.rep = rep;
	}

	@GetMapping("/cleate")
	public String list(Model model) {
		Book book = new Book();
		model.addAttribute("book", book);
		return "create";
	}

	@PostMapping("/result")
	public String PostBook() {
		return "view";

	}

	@PostMapping("/save")
	public String save(@Validated @ModelAttribute Book book, BindingResult result, Model model,RedirectAttributes attrs) {
		if (result.hasErrors()) {//バリデーションエラー時の処理
			return "create";
		}
		rep.save(book);
		attrs.addFlashAttribute("success", "データの登録に成功しました。");

		return "redirect:/list";
	}

	@PostMapping("/save2")
	public String save2(@Validated @ModelAttribute Book book, BindingResult result, Model model,RedirectAttributes attrs) {
		if (result.hasErrors()) {//バリデーションエラー時の処理
			return "hen";
		}
		rep.save(book);
		attrs.addFlashAttribute("success", "データの編集に成功しました。");
		return "redirect:/list";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model model) {
		Book b = rep.findById(id).get();
		model.addAttribute("book", b);
		return "hen";
	}

	@GetMapping("/del/{id}")
	public String del(@PathVariable int id, Model model, RedirectAttributes attrs) {
		rep.deleteById(id);
		attrs.addFlashAttribute("success", "データの削除に成功しました。");
		return "redirect:/list";
	}

}
