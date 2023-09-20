package designpatterns.demo;

import designpatterns.demo.strategydesignpattern.GoodsVehicle;
import designpatterns.demo.strategydesignpattern.SportsVehicle;
import designpatterns.demo.strategydesignpattern.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
		Vehicle vehicle = new GoodsVehicle();
		vehicle.drive();
	}

}
