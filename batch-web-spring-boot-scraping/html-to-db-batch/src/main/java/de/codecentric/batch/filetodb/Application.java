package de.codecentric.batch.filetodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Import;

import de.codecentric.batch.filetodb.configuration.DataSourceConfiguration;

@SpringBootConfiguration
@EnableAutoConfiguration
@Import(DataSourceConfiguration.class)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
