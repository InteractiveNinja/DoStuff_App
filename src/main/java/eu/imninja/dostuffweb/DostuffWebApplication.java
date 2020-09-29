package eu.imninja.dostuffweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DostuffWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DostuffWebApplication.class, args);


	}

}
