package test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")

public class HelloController {
	List<String> newList = new ArrayList<String>();

	@RequestMapping(method = RequestMethod.GET)
	//public String printHello(ModelMap model) {
	public List<String> list(){
		//model.addAttribute("message", "Hello Spring MVC Framework!");
		//return "hello";
		newList.add("Varr");
		return newList;
	}
}
