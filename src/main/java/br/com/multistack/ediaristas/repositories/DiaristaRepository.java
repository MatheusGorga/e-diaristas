package br.com.multistack.ediaristas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.multistack.ediaristas.models.Diarista;

public interface DiaristaRepository extends JpaRepository<Diarista, Long>{
    
}


