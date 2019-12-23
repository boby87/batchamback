package com.cobade.batcham;

import com.cobade.batcham.Service.LectureFichier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BatchamApplication implements CommandLineRunner {

	@Autowired
	private LectureFichier lectureFichier;
	public static void main(String[] args) {
		SpringApplication.run(BatchamApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		lectureFichier.AddExcel();
		lectureFichier.AddExcelQuartier();
		lectureFichier.AddExcelSecteur();
	}
}
