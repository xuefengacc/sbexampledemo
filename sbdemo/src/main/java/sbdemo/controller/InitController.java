package sbdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class InitController {
    
	@GetMapping("test")
	public res test() {
		return new res("Message from back end");
	}
	
}

//Remove later
class res{
	public String mes;
	
	public res(String mes) {
		this.mes = mes;
	}
}