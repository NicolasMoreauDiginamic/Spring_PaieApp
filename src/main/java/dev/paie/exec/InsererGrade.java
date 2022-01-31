package dev.paie.exec;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import dev.paie.entites.Grade;
import dev.paie.repositories.GradeRepository;

@Controller
@Profile("insertGrade")
public class InsererGrade implements CommandLineRunner {
	
	private GradeRepository gradeRepo;

	public void InsererUnGrade(GradeRepository gradeRepo) {
		
		this.gradeRepo = gradeRepo;
	}
	
	@Override
	public void run(String... args) throws Exception{
		Grade grade = new Grade();
		grade.setCode("GRADE_D");
		grade.setNbHeuresBase(new BigDecimal("200.00"));
		grade.setTauxBase(new BigDecimal("10.80"));
		
		this.gradeRepo.save(grade);
	}
}
