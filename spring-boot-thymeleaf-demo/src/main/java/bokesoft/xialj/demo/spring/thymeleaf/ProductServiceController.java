package bokesoft.xialj.demo.spring.thymeleaf;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductServiceController {
	@RequestMapping(value = "/showprod")
	public String showProduct(Model model) throws IOException {
		model.addAttribute("name", "可乐");
		model.addAttribute("price", 3.50);
		return "showprod";
	}
	
	@RequestMapping(value = "/showprodempty")
	public String showProductEmpty(Model model) throws IOException {
		return "showprod";
	}
}

