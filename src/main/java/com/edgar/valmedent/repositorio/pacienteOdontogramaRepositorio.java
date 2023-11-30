package com.edgar.valmedent.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edgar.valmedent.modelo.pacienteOdontograma;

@Repository
public interface pacienteOdontogramaRepositorio extends JpaRepository<pacienteOdontograma, Long> {

}