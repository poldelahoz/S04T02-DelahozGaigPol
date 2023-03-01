package cat.itacademy.barcelonactiva.delahoz.pol.s04.t02.n03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class S04T02N03DelahozGaigPolApplication {

	public static void main(String[] args) {
		SpringApplication.run(S04T02N03DelahozGaigPolApplication.class, args);
	}

}
