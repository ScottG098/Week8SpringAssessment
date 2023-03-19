package week8Spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import week8Spring.beans.House;
import week8Spring.repository.HouseRepository;
import week8Spring.controller.Week8BeanConfiguration;

@SpringBootApplication
public class Week8SpringAssessmentApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Week8SpringAssessmentApplication.class, args);
	}
	
		@Autowired
		HouseRepository repo;
		
		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
		
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(Week8BeanConfiguration.class);
		
		House a = appContext.getBean("House", House.class);
			a.setAddress("123 Main Street");
			a.setNumOfBeds(2);
			a.setNumOfBaths(1);
			a.setForSale(true);
			repo.save(a);
			
		House b = new House("101 13th Ave", 4, 2, false);
		
			repo.save(b);
		
			List<House> allHouses = repo.findAll();
			for(House homes: allHouses) {
				System.out.println(homes.toString());
			}
			((AbstractApplicationContext) appContext).close();
	}

}
