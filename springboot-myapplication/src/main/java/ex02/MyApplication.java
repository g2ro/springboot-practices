package ex02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan // 적용된 클래스의 하루 패키지 포함, 
@SpringBootConfiguration
public class MyApplication { // bootstrap클래스는 항상 최상위에 존재해야함.
	
	public static void main(String[] args) {
		try (ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args)) {			
		}
	}
	
}
