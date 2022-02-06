package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/info")
	public String info()
	 { System.out.println("methode info");
	return "home/info";
	 }
	@RequestMapping("/affichage")//ce que je tape dans l'url
	public String affiche()
	{System.out.println("methode info");
		return "home/affichage";//le nom de la vue sous template/home
	}
}