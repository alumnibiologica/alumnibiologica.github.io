package pt.ist.alumnibiologica.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebsiteController {

	@RequestMapping("/")
	public String index() {
		return "index/index";
	}

}
