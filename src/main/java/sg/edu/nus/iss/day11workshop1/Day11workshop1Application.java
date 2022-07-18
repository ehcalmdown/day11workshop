package sg.edu.nus.iss.day11workshop1;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day11workshop1Application {
	public static void main(String[] args) {
		//SpringApplication.run(Day11workshop1Application.class, args);
		SpringApplication app = new SpringApplication(Day11workshop1Application.class);
		String port = "3000";
		ApplicationArguments cliOpts= new DefaultApplicationArguments(args);
		if( cliOpts.containsOption("port")){
			port = cliOpts.getOptionValues("port").get(0);
			app.setDefaultProperties("3000", port);
		}
	}

}
