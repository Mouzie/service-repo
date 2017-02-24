package za.co.reverside.test;

import org.springframework.web.bind.RestController;
import org.springframework.web.bind.RequestMapping;

@RestController
public class Service{

	@RequestMapping(path="api/java/hello")
	public String hello(){
		return "Hello";
	}
}