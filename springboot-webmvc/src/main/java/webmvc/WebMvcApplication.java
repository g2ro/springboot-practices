package webmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@SpringBootApplication
public class WebMvcApplication {
	
	
	@Controller
	public static class MvcController {
		@ResponseBody
		@GetMapping("/hello1")
		public String hello1() {
			return "hello world";
		}
		
		@GetMapping("/hello2")
		public String hello2() {
			return "hello";
		}
	}
	
//	@RestController
//	public static class MvcController {
//		
//		@GetMapping("/hello")
//		public String hello() {
//			return "hello world";
//		} // 내부 까지 실행됨.
//	} // jackson 응답
	
	public static void main(String[] args) {
		SpringApplication.run(WebMvcApplication.class, args); // try catch로 구현x =>close와 관련?
	}

}
