package com.example.demo;

import com.example.demo.Engineers.*;
import com.example.demo.user.User;
import com.example.demo.user.UserHttpClient;
import com.example.demo.user.UserRestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);


	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		log.info("Application Started Successfully");



//		WelcomeMessage welcomeMsg = (WelcomeMessage) context.getBean("welcomeMessage");
//		System.out.println(welcomeMsg);
//		var welcomeMessage = new Welcome();
//		System.out.println(welcomeMessage.getWelcomeMessage());
	}

	@Bean
	UserHttpClient userHttpClient() {
		RestClient restClient = RestClient.create("http://jsonplaceholder.typicode.com/");
		HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(RestClientAdapter.create(restClient)).build();
		return factory.createClient(UserHttpClient.class);
	}
//
//	@Bean
//	CommandLineRunner runner(EngineerService engineerService) {
//		return args -> {
//			List<EngineerDTO> engineers = engineerService.getAllEngineers();
//			log.info("List of engineers: " + engineers);
//		};
//	}

}
