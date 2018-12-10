package bokesoft.xialj.demo.spring.thymeleaf;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templatemode.TemplateMode;

@Controller
public class ProductSelfServiceController implements ApplicationContextAware {
	private ServletContext servletContext;
	private TemplateEngine templateEngine;

	@RequestMapping(value = "/selfshowprod")
	public void showProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
		WebContext ctx = new WebContext(request, response, this.servletContext, request.getLocale());
		ctx.setVariable("name", "可乐");
		ctx.setVariable("price", 3.50);
		templateEngine.process("showprod", ctx, response.getWriter());
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
		templateResolver.setApplicationContext(applicationContext);
		templateResolver.setTemplateMode(TemplateMode.HTML);
        templateResolver.setPrefix("classpath:/templates/");
        templateResolver.setSuffix(".html");
        templateResolver.setCacheTTLMs(Long.valueOf(3600000L));
        templateResolver.setCacheable(true);
        this.templateEngine = new TemplateEngine();
        this.templateEngine.setTemplateResolver(templateResolver);
	}
}
