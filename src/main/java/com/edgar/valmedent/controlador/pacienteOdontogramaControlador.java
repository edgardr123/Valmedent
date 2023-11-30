package com.edgar.valmedent.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edgar.valmedent.excepciones.ResourceNotFoundException;
import com.edgar.valmedent.modelo.pacienteOdontograma;
import com.edgar.valmedent.repositorio.*;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200/")
public class pacienteOdontogramaControlador {

	@Autowired
	private pacienteOdontogramaRepositorio repositorio;

	//metodo para mostrar lista de todos los dientes
	@GetMapping("/pacientesOdontograma")
	public List<pacienteOdontograma> listarTodosLosDientes() {
		return repositorio.findAll();
	}
	//metodo par guardar dientes
	@PostMapping("/pacientesOdontograma")
	public pacienteOdontograma guardarDiente(@RequestBody pacienteOdontograma pacienteOdontograma) {
		return repositorio.save(pacienteOdontograma);
	}
	//metodo para buscar pacientes
	@GetMapping("/pacientesOdontograma/{id}")
	public ResponseEntity<pacienteOdontograma> obtenerDienteId(@PathVariable Long id){
		pacienteOdontograma pacienteOdontograma = repositorio.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(("No existe el diente con el ID: " + id)));
		return ResponseEntity.ok(pacienteOdontograma);
	}
	
	//se actualiza
	@PutMapping("/pacientesOdontograma/{id}")
	public ResponseEntity<pacienteOdontograma> actualizarPacienteOdontograma(@PathVariable Long id,@RequestBody pacienteOdontograma detallesOdontograma){
		pacienteOdontograma pacienteOdontograma = repositorio.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(("No existe el paciente con el ID: " + id)));
		
		// Superior Derecha
		pacienteOdontograma.setSD11(pacienteOdontograma.getSD11());
		pacienteOdontograma.setSD12(pacienteOdontograma.getSD12());
		pacienteOdontograma.setSD13(pacienteOdontograma.getSD13());
		pacienteOdontograma.setSD14(pacienteOdontograma.getSD14());
		pacienteOdontograma.setSD15(pacienteOdontograma.getSD15());
		pacienteOdontograma.setSD16(pacienteOdontograma.getSD16());
		pacienteOdontograma.setSD17(pacienteOdontograma.getSD17());
		pacienteOdontograma.setSD18(pacienteOdontograma.getSD18());
		
		// Superior Izquierda
		pacienteOdontograma.setSI21(pacienteOdontograma.getSI21());
		pacienteOdontograma.setSI22(pacienteOdontograma.getSI22());
		pacienteOdontograma.setSI23(pacienteOdontograma.getSI23());
		pacienteOdontograma.setSI24(pacienteOdontograma.getSI24());
		pacienteOdontograma.setSI25(pacienteOdontograma.getSI25());
		pacienteOdontograma.setSI26(pacienteOdontograma.getSI26());
		pacienteOdontograma.setSI27(pacienteOdontograma.getSI27());
		pacienteOdontograma.setSI28(pacienteOdontograma.getSI28());
		
		// Inferior Izquierda
		pacienteOdontograma.setIZ31(pacienteOdontograma.getIZ31());
		pacienteOdontograma.setIZ32(pacienteOdontograma.getIZ32());
		pacienteOdontograma.setIZ33(pacienteOdontograma.getIZ33());
		pacienteOdontograma.setIZ34(pacienteOdontograma.getIZ34());
		pacienteOdontograma.setIZ35(pacienteOdontograma.getIZ35());
		pacienteOdontograma.setIZ36(pacienteOdontograma.getIZ36());
		pacienteOdontograma.setIZ37(pacienteOdontograma.getIZ37());
		pacienteOdontograma.setIZ38(pacienteOdontograma.getIZ38());
		
		// Inferior Derecha
		pacienteOdontograma.setID41(pacienteOdontograma.getID41());
		pacienteOdontograma.setID42(pacienteOdontograma.getID42());
		pacienteOdontograma.setID43(pacienteOdontograma.getID43());
		pacienteOdontograma.setID44(pacienteOdontograma.getID44());
		pacienteOdontograma.setID45(pacienteOdontograma.getID45());
		pacienteOdontograma.setID46(pacienteOdontograma.getID46());
		pacienteOdontograma.setID47(pacienteOdontograma.getID47());
		pacienteOdontograma.setID48(pacienteOdontograma.getID48());
		
		pacienteOdontograma odontogramaActualizado = repositorio.save(pacienteOdontograma);
		return ResponseEntity.ok(odontogramaActualizado);
	}
}