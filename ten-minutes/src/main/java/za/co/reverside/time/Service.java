package za.co.reverside.time;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service{

	@RequestMapping(path="api/hello")
	public String getName(){
		return "Hello";
	}

}