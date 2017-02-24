package za.co.reverside.test;


import java.util.Date;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class Service{

	@RequestMapping(path="api/java/hello")
	public String hello(){
		return "Hello";
	}

	@RequestMapping(path="api/java/time")
	public String getTime(){
		return new Date().toString();
	}

	@RequestMapping(path="api/java/calculate" , method=RequestMethod.GET )
	public int calc(){
		int a,b,c;
		a = 10;
		b = 20;
		c = a + b;

		return c;
	}

	@RequestMapping(path="api/java/book", method=RequestMethod.GET)
	public Book testBook(){
		Book book = new Book();
		book.setTitle("Hunger Games");
		book.setAuthor("Suzanne Collins");
		book.setIsbn(2020202);

		return book;
	}
}