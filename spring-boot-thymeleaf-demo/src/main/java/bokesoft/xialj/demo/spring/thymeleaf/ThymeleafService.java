package bokesoft.xialj.demo.spring.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class ThymeleafService {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ThymeleafService.class, args);
	}
}
