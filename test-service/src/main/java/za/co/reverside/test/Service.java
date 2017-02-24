package za.co.reverside.test;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Service{

	@RequestMapping(path="api/java/hello")
	public String hello(){
		return "Hello";
	}
}