package app.controllers;

import app.models.User;
import app.services.MyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private final MyService myService;

	public HelloController(MyService myService) {
		this.myService = myService;
	}

	@RequestMapping("/")
	public String index() {

		User user = new User("Person Name ");
		return myService.message() +  user.getNome() + myService.files();
	}

}