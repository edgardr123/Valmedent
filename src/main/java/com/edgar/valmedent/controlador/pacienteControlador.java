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
import com.edgar.valmedent.modelo.paciente;
import com.edgar.valmedent.repositorio.*;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200/")
public class pacienteControlador {

	@Autowired
	private pacienteRepositorio repositorio;

	//metodo para mostrar lista de todos los pacientes
	@GetMapping("/pacientes")
	public List<paciente> listarTodosLosPacientes() {
		return repositorio.findAll();
	}
	//metodo par guardar pacientes
	@PostMapping("/pacientes")
	public paciente guardarPaciente(@RequestBody paciente paciente) {
		return repositorio.save(paciente);
	}
	//metodo para buscar pacientes
	@GetMapping("/pacientes/{id}")
	public ResponseEntity<paciente> obtenerPacienteId(@PathVariable Long id){
		paciente paciente = repositorio.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(("No existe el paciente con el ID: " + id)));
		return ResponseEntity.ok(paciente);
	}
	
	//se actualiza
	@PutMapping("/pacientes/{id}")
	public ResponseEntity<paciente> actualizarPaciente(@PathVariable Long id,@RequestBody paciente detallesPaciente){
		paciente paciente = repositorio.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(("No existe el paciente con el ID: " + id)));
		
		paciente.setNombre(detallesPaciente.getNombre());
		paciente.setApellidoP(detallesPaciente.getApellidoP());
		paciente.setApellidoM(detallesPaciente.getApellidoM());
		paciente.setEmail(detallesPaciente.getEmail());
		paciente.setTelefono(detallesPaciente.getTelefono());
		paciente.setDireccion(detallesPaciente.getDireccion());
		paciente.setEmail(detallesPaciente.getEmail());
		paciente.setEmail(detallesPaciente.getEmail());
		paciente.setCiudad(detallesPaciente.getCiudad());
		paciente.setCodigoPostal(detallesPaciente.getCodigoPostal());
		paciente.setSexo(detallesPaciente.getSexo());
		paciente.setEdad(detallesPaciente.getEdad());
		paciente.setFechaNacimiento(detallesPaciente.getFechaNacimiento());
		paciente.setOcupacion(detallesPaciente.getOcupacion());
		paciente.setMedicamentos(detallesPaciente.getMedicamentos());
		paciente.setAlergias(detallesPaciente.getAlergias());
		paciente.setReacciones(detallesPaciente.getReacciones());
		
		paciente pacienteActualizado = repositorio.save(paciente);
		return ResponseEntity.ok(pacienteActualizado);
	}
}
