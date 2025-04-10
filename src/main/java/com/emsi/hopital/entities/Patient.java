package com.emsi.hopital.entities;

import java.util.Collection;
import java.util.Date;

public class Patient {
    private Long id;
    private String name;
    private Date dateOfBirth;
    private boolean malade;
    private Collection<RendezVous> rendezVous;
}
