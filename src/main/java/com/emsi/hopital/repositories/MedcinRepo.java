package com.emsi.hopital.repositories;

import com.emsi.hopital.entities.Medcin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedcinRepo extends JpaRepository<Medcin, Long> {
}
