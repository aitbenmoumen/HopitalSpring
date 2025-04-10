package com.emsi.hopital.entities;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class RendezVous {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private boolean annule;
    private StatusRdv status;
    @ManyToOne
    private Medcin medcin;
    @ManyToOne
    private Patient patient;
    @OneToOne(mappedBy = "rendezVous")
    private Consultation consultation;
}
