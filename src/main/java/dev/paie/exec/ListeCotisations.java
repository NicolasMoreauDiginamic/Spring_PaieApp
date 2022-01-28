package dev.paie.exec;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import dev.paie.entites.Cotisation;

@Controller
@Profile("nextCotisation")
public class ListeCotisations implements CommandLineRunner {
	
	private List<Cotisation> listeCoti;

	public ListeCotisations(List<Cotisation> listeCoti) {
		super();
		this.listeCoti = listeCoti;
	}
	
	@Override
	public void run(String... args) throws Exception{
		
	}

}
