package pt.ist.alumnibiologica.website;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pt.ist.alumnibiologica.website.repository.UserRepository;

@SpringBootApplication
public class WebsiteApplication {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(WebsiteApplication.class, args);
	}

}