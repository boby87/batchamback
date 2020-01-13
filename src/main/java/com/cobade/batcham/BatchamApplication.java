package com.cobade.batcham;

import com.cobade.batcham.Metier.PersonneMetier;
import com.cobade.batcham.Model.Personne;
import com.cobade.batcham.Service.LectureFichier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BatchamApplication implements CommandLineRunner {

	@Autowired
	private LectureFichier lectureFichier;
	@Autowired
	private PersonneMetier personneMetier;
	public static void main(String[] args) {
		SpringApplication.run(BatchamApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		lectureFichier.AddExcel();
		lectureFichier.AddExcelQuartier();
		lectureFichier.AddExcelSecteur();
		Personne personne=personneMetier.findBynompersonne("Tieulong Tamafo Hilaire");
		personne.setPassword("123456789");
		personneMetier.savePersonne(personne);
	}
}
