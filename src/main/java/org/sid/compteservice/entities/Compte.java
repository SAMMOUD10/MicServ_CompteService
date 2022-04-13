package org.sid.compteservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.compteservice.enums.TypeCompte;

import javax.persistence.*;
import java.util.Date;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Compte {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    private double solde;
    private Date DateCreation;
    @Enumerated(EnumType.STRING)
    private TypeCompte type;
}
