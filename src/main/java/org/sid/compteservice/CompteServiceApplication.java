package org.sid.compteservice;

import org.sid.compteservice.entities.Compte;
import org.sid.compteservice.enums.TypeCompte;
import org.sid.compteservice.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
public class CompteServiceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CompteServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }

    @Bean
    CommandLineRunner start(CompteRepository compteRepository, RepositoryRestConfiguration restConfiguration){
        return args -> {
            restConfiguration.exposeIdsFor(Compte.class);
            compteRepository.save(new Compte(null,98000,new Date(), TypeCompte.COURANT));
            compteRepository.save(new Compte(null,12000,new Date(), TypeCompte.EPARGNE));
            compteRepository.save(new Compte(null,2100,new Date(), TypeCompte.COURANT));
            // chercher toutes les comptes et afficher leurs type et solde
            compteRepository.findAll().forEach(cp->{
                System.out.println(cp.getType());
                System.out.println(cp.getSolde());
            });
        };
    }
}
