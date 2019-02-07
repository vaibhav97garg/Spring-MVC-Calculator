package spring.mvc.test.II;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerClass {
	
	@RequestMapping("/")
	public String firstfunction() {
		return "first_form";
	}
	
	@RequestMapping("/show_form") 
	public String testfunction() {
		return "show_form";
	}
	
	@RequestMapping("/process_form")
	public String testfunction2(@RequestParam("op1") int op1, @RequestParam("op2") int op2, @RequestParam("op") String op, Model model) {
		int result=0;
		//op1=Request.getParameter("op1");
		//op2=Request.getParameter("op2");
		switch(op) {
		case "+" : result=op1+op2;
		break;
		case "-": result=op1-op2;
		break;
		case "/" : if(op2!=0) {
			result=op1/op2;
		}
		else {
			System.out.println("Divide by zero error");
		}
		break;
		case "*": result=op1*op2;
		break;
		case "%": result=op1%op2;
		break;
		}
		
		
		model.addAttribute("ans",result);
		return "process_form";
	}

}
