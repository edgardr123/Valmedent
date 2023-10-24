package com.edgar.valmedent.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edgar.valmedent.modelo.paciente;

@Repository
public interface pacienteRepositorio extends JpaRepository<paciente, Long> {

}
