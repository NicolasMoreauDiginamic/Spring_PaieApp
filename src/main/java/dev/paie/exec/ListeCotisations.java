package dev.paie.exec;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import dev.paie.entites.Cotisation;
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
		List<Cotisation> listCoti = cotiRepo.findAll();
		
		for(Cotisation uneCoti : listCoti) {
			System.out.println(uneCoti.getCode() + " " + uneCoti.getLibelle());
		}
		
	}

}
