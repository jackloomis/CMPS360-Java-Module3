package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HelloController {

	@GetMapping("/animal/{animal}")
	public String animal(@PathVariable String animal) {
		if (animal.equalsIgnoreCase("cat")) {
			return "Meow!";
		}
		else if (animal.equalsIgnoreCase("dog")) {
			return "Woof!";
		}
		else if (animal.equalsIgnoreCase("cow")) {
			return "Moo!";
		}
		else if (animal.equalsIgnoreCase("pig")) {
			return "Oink!";
		} else {
		return "Error: Unknown Animal";
		}
	}
}
