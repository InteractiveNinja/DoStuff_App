package eu.imninja.dostuffweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class DostuffWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DostuffWebApplication.class, args);

		System.setProperty("http.proxyHost","proxy.coop.ch");
		System.setProperty("http.proxyPort","3128");

	}

}
