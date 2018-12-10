package bokesoft.xialj.demo.spring.session.web;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/setValue")
	public String setValue(@RequestParam(name = "key", required = false) String key,
			@RequestParam(name = "value", required = false) String value,
			HttpServletRequest request) {
		if (!ObjectUtils.isEmpty(key) && !ObjectUtils.isEmpty(value)) {
			request.getSession().setAttribute(key, value);
			request.getSession().setAttribute(UUID.randomUUID().toString(), new BadCredentialsException("test"));
		}
		return "home";
	}
}
