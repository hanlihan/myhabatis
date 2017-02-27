package com.ittx.car.servlerStruts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LongAction {
	@RequestMapping("/login")
	public String login(Model model) {
		return "login";
	}

	@RequestMapping("/main")
	public String main(String username, String password, Model model) {
		if ("admin".equals(username) && "123".equals(password)) {
			return "main";
		} else {
			model.addAttribute("error", "账户或密码不正确");
			return "login";
		}
	}

	@RequestMapping("/addCar")
	public String add(Model model) {
		return "car/addCar";
	}
	@RequestMapping("/Show_Car")
	public String Show_Car(Model model) {
		return "car/Show_Car";
	}
	@RequestMapping("/findCar")
	public String findCar(Model model) {
		return "car/findCar";
	}
	@RequestMapping("/Find_Car")
	public String Find_Car(Model model) {
		return "car/Find_Car";
	}
	@RequestMapping("/update")
	public String update(Model model) {
		return "car/update";
	}
}
