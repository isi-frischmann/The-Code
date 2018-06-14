package com.isabell.theCode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@PostMapping("/rightGuess")
		public String guess(@RequestParam(value="code") String guess, RedirectAttributes redirectAttributes) {
//		System.out.println(guess);	
		if(guess.equals("Bushido")) {
//				System.out.println("inside");
				return "redirect:/win";
			}
			else {
//				System.out.println("Wrong");
					redirectAttributes.addFlashAttribute("error", "You must train harder");
					return "redirect:/";
				}
			}
	
	@RequestMapping("/win")
		public String won() {
		return "won.jsp";
	}

}
