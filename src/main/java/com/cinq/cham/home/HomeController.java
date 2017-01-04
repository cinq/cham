package com.cinq.cham.home;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Cinq Hadoop Application Monitoring!";
	}

}