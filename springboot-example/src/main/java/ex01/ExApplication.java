package ex01;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExApplication { // Bootstrap Class, Configuration class main에서 run 함수를 실행되면 read.me 참고

	@Bean
	public Map<?, ?> myMap() {
		return Map.of("greetings", "Hello World");
	}

	public static void main(String[] args) {
//		ConfigurableApplicationContext ac = null;
//		try {
//			ac = SpringApplication.run(ExApplication.class, args); // run 내부에서 컨테이너를 만들고 ExApplication이 스캔을 한다. start를 만나 // run => bootstrapping 하는 함수
//																	// run 은 부스트랩 메서드
//			System.out.println("ExApplication runs..." + ac.getBean("myMap", Map.class).get("greetings"));
//		} catch (Exception ignore) {
//		} finally {
//			ac.close();
//		}
		
		try(ConfigurableApplicationContext ac = SpringApplication.run(ExApplication.class, args)){
			System.out.println("ExApplication runs..." + ac.getBean("myMap", Map.class).get("greetings"));
			// 부트스태랩을 실행되고 마지막으로 실행해야할 게 있을 때 run() 함수가 실행된다.
		} 
	}

}
