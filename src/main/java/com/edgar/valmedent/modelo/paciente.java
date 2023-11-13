package com.edgar.valmedent.modelo;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pacientes")
public class paciente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre", length = 60, nullable = false)
	private String nombre;

	@Column(name = "apellidoP", length = 60, nullable = false)
	private String apellidoP;
	@Column(name = "apellidoM", length = 60, nullable = false)
	private String apellidoM;

	@Column(name = "email", length = 60, nullable = false, unique = true)
	private String email;
	
	@Column(name = "telefono")
    private String telefono;

	@Column(name = "direccion")
    private String direccion;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "codigo_postal")
    private String codigoPostal;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "edad")
    private Integer edad;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "ocupacion")
    private String ocupacion;

    @Column(name = "medicamentos", length = 600)
    private String medicamentos;

    @Column(name = "alergias", length = 600)
    private String alergias;

    @Column(name = "reacciones", length = 600)
    private String reacciones;
	
    
    
    public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public String getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(String medicamentos) {
		this.medicamentos = medicamentos;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public String getReacciones() {
		return reacciones;
	}

	public void setReacciones(String reacciones) {
		this.reacciones = reacciones;
	}

	public paciente() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoP() {
		return apellidoP;
	}

	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}
	public String getApellidoM() {
		return apellidoM;
	}

	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public paciente(Long id, String nombre, String apellidoP,String apellidoM, String email, String telefono, String direccion,
			String ciudad, String codigoPostal, String sexo, Integer edad, Date fechaNacimiento, String ocupacion,
			String medicamentos, String alergias, String reacciones) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.email = email;
		this.telefono = telefono;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.codigoPostal = codigoPostal;
		this.sexo = sexo;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		this.ocupacion = ocupacion;
		this.medicamentos = medicamentos;
		this.alergias = alergias;
		this.reacciones = reacciones;
	}
}
