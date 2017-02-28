package za.co.reverside.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service{

	@RequestMapping(path="hello")
	public String hello(){
		return "Hey";
	}

	@RequestMapping(path="api/window")
	public Window testWindow(){

		Window window = new Window();

		window.setColor("Brown");
		window.setSize(200.0);

		return window;
	}

}