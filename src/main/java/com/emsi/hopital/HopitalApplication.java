package com.emsi.hopital;

import com.emsi.hopital.entities.Medcin;
import com.emsi.hopital.entities.Patient;
import com.emsi.hopital.repositories.MedcinRepo;
import com.emsi.hopital.repositories.PatientRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class HopitalApplication {

    public static void main(String[] args) {
        SpringApplication.run(HopitalApplication.class, args);
    }

    /*
    @Bean  // cette annotation informe spring d'executer une meth au demarrage
    CommandLineRunner start(PatientRepo patientRepo) {
        return args -> {
            Patient patient = new Patient();
            patient.setName("John Doe");
            patient.setMalade(true);
            patient.setDateOfBirth(new Date());
            patientRepo.save(patient);
        };
    }
    */

    @Bean
    CommandLineRunner start(PatientRepo patientRepo, MedcinRepo medcinRepo) {
        return args -> {
            Stream.of("Ali", "Hicham", "Yousef")
            .forEach(name -> {
                Patient patient = new Patient();
                patient.setName(name);
                patient.setMalade(true);
                patient.setDateOfBirth(new Date());
                patientRepo.save(patient);

            });
            Stream.of("Ahmed", "Salmane", "Hamid")
                    .forEach(name-> {
                        Medcin medcin = new Medcin();
                        medcin.setNom(name);
                        medcin.setEmail(name+".email@gmail.com");
                        medcin.setSpecialite(Math.random()>0.5?"Cardio":"Dentiste");
                        medcinRepo.save(medcin);
                    });
        };
    }

}
