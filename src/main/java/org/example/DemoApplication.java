package org.example;

import org.example.api.CassandraController;
import org.example.crud.CrudService;
import org.example.model.CasinoBuilding;
import org.example.model.cassandra.CassandraCasinoBuilding;
import org.example.repo.cassandra.CassandraCasinoBuildingRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication//(scanBasePackages = { "org.example.api", " org.example.repo.cassandra", "org.example.model.cassandra", "org.example.model", "org.example.crud", "org.example.config"})
@ComponentScan(basePackageClasses = { CassandraController.class, CrudService.class, CasinoBuilding.class, CassandraCasinoBuildingRepository.class, CassandraCasinoBuilding.class})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run (DemoApplication.class, args);
	}

}
