package za.co.reverside.test;


import java.util.Date;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Service{

	@RequestMapping(path="api/java/hello")
	public String hello(){
		return "Hello";
	}

	@RequestMapping(path="api/java/time")
	public String getTime(){
		return new Date.toString();
	}
}