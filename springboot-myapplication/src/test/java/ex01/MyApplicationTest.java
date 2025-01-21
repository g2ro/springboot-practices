package ex01;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class MyApplicationTest {
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@Test
	public void testMyComponentNotNull() {
		MyComponent mycomponent = applicationContext.getBean("MyComponent01", MyComponent.class);
		assertNotNull(mycomponent);
	}
	
	@Test
	public void testMyComponent02Null() {
		// MyComponent mycomponent = applicationContext.getBean("MyComponent02", MyComponent.class); //getBean의 경우 해당 되는 class가 없다면 exception을 발생시킨다.
		// assertNull(mycomponent);
		
		//@SpringBootTest 에서는 @Configuration을 달고 있는 설정 클래스는 찾지 못한다.
		assertThrows(NoSuchBeanDefinitionException.class, () -> {
			applicationContext.getBean("MyComponent02", MyComponent.class);
		});
	}
}
