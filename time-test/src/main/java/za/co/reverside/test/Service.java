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
}