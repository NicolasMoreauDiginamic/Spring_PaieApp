package dev.paie.exec;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import dev.paie.repositories.CotisationRepository;

@Controller
@Profile("listCotisation")
public class ListeCotisations implements CommandLineRunner {
	
	private CotisationRepository cotiRepo;
	
	public void ListerCotisation(CotisationRepository cotiRepo) {
		this.cotiRepo = cotiRepo;
	}
	
	@Override
	public void run(String... args) throws Exception{
		this.cotiRepo
		.findAll()
		.forEach(System.out::println);
	}

}
