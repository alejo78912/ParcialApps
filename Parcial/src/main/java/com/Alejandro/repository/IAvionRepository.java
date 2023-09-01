package com.Alejandro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Alejandro.models.Avion;


public interface IAvionRepository extends JpaRepository<Avion, String>{

}
