package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AboutController {
	
	@ResponseBody
	@RequestMapping("/about")
	public String about() {
		
		return "This is about url";
	}

}
