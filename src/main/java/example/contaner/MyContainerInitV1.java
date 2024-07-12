package example.contaner;

import java.util.Set;

import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;

public class MyContainerInitV1 implements ServletContainerInitializer{

	@Override
	public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
		System.out.println("MyContainerInitV1.onStartup");
		System.out.println("MyContainerInitV1 c = " + c);
		System.out.println("MyContainerInitV1 ctx = " + ctx);
	}
	
	// Set<Class<?>> c : 유연한 초기화 기능을 제공, @HandlesTypes과 함께 사용
	// ServletContext ctx : Sevlet Container 자체의 기능을 제공, 이 객체릁 통해 filter, sevlet을 등록

}