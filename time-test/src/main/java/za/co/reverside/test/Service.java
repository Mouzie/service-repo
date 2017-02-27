package za.co.reverside.test;

import java.util.Date;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class Service{

	@RequestMapping(path="time")
	public String timeTest(){
		return new Date().toString();
	}

	@RequestMapping(path="api/name")
	public String name(){
		return "Moses Mathebula";
	}

	@RequestMapping(path="api/maths")
	public double numbers(){
		double a,s,d;
		s = 2.5;
		d = 55.0;
		a = s + d;

		return a;
	}
}