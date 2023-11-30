package com.edgar.valmedent.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pacientesOdontograma")
public class pacienteOdontograma {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// Superior Derecha
	@Column(name = "SD11")
	private String SD11;
	@Column(name = "SD12")
	private String SD12;
	@Column(name = "SD13")
	private String SD13;
	@Column(name = "SD14")
	private String SD14;
	@Column(name = "SD15")
	private String SD15;
	@Column(name = "SD16")
	private String SD16;
	@Column(name = "SD17")
	private String SD17;
	@Column(name = "SD18")
	private String SD18;

	// Superior Izquierda
	@Column(name = "SI21")
	private String SI21;
	@Column(name = "SI22")
	private String SI22;
	@Column(name = "SI23")
	private String SI23;
	@Column(name = "SI24")
	private String SI24;
	@Column(name = "SI25")
	private String SI25;
	@Column(name = "SI26")
	private String SI26;
	@Column(name = "SI27")
	private String SI27;
	@Column(name = "SI28")
	private String SI28;

	// Inferior Izquierda
	@Column(name = "IZ31")
	private String IZ31;
	@Column(name = "IZ32")
	private String IZ32;
	@Column(name = "IZ33")
	private String IZ33;
	@Column(name = "IZ34")
	private String IZ34;
	@Column(name = "IZ35")
	private String IZ35;
	@Column(name = "IZ36")
	private String IZ36;
	@Column(name = "IZ37")
	private String IZ37;
	@Column(name = "IZ38")
	private String IZ38;

	// Inferior Derecha
	@Column(name = "ID41")
	private String ID41;
	@Column(name = "ID42")
	private String ID42;
	@Column(name = "ID43")
	private String ID43;
	@Column(name = "ID44")
	private String ID44;
	@Column(name = "ID45")
	private String ID45;
	@Column(name = "ID46")
	private String ID46;
	@Column(name = "ID47")
	private String ID47;
	@Column(name = "ID48")
	private String ID48;
	   
	    // Otras columnas de tu nueva tabla

	    @ManyToOne
	    @JoinColumn(name = "paciente_id")  // Nombre de la columna de la llave foránea
	    private paciente paciente;

	    // Getters y setters
	    public Long getId() {
			return id;
		}

		
	    public pacienteOdontograma() {
			
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getSD11() {
			return SD11;
		}

		public void setSD11(String sD11) {
			SD11 = sD11;
		}

		public String getSD12() {
			return SD12;
		}

		public void setSD12(String sD12) {
			SD12 = sD12;
		}

		public String getSD13() {
			return SD13;
		}

		public void setSD13(String sD13) {
			SD13 = sD13;
		}

		public String getSD14() {
			return SD14;
		}

		public void setSD14(String sD14) {
			SD14 = sD14;
		}

		public String getSD15() {
			return SD15;
		}

		public void setSD15(String sD15) {
			SD15 = sD15;
		}

		public String getSD16() {
			return SD16;
		}

		public void setSD16(String sD16) {
			SD16 = sD16;
		}

		public String getSD17() {
			return SD17;
		}

		public void setSD17(String sD17) {
			SD17 = sD17;
		}

		public String getSD18() {
			return SD18;
		}

		public void setSD18(String sD18) {
			SD18 = sD18;
		}

		public String getSI21() {
			return SI21;
		}

		public void setSI21(String sI21) {
			SI21 = sI21;
		}

		public String getSI22() {
			return SI22;
		}

		public void setSI22(String sI22) {
			SI22 = sI22;
		}

		public String getSI23() {
			return SI23;
		}

		public void setSI23(String sI23) {
			SI23 = sI23;
		}

		public String getSI24() {
			return SI24;
		}

		public void setSI24(String sI24) {
			SI24 = sI24;
		}

		public String getSI25() {
			return SI25;
		}

		public void setSI25(String sI25) {
			SI25 = sI25;
		}

		public String getSI26() {
			return SI26;
		}

		public void setSI26(String sI26) {
			SI26 = sI26;
		}

		public String getSI27() {
			return SI27;
		}

		public void setSI27(String sI27) {
			SI27 = sI27;
		}

		public String getSI28() {
			return SI28;
		}

		public void setSI28(String sI28) {
			SI28 = sI28;
		}

		public String getIZ31() {
			return IZ31;
		}

		public void setIZ31(String iZ31) {
			IZ31 = iZ31;
		}

		public String getIZ32() {
			return IZ32;
		}

		public void setIZ32(String iZ32) {
			IZ32 = iZ32;
		}

		public String getIZ33() {
			return IZ33;
		}

		public void setIZ33(String iZ33) {
			IZ33 = iZ33;
		}

		public String getIZ34() {
			return IZ34;
		}

		public void setIZ34(String iZ34) {
			IZ34 = iZ34;
		}

		public String getIZ35() {
			return IZ35;
		}

		public void setIZ35(String iZ35) {
			IZ35 = iZ35;
		}

		public String getIZ36() {
			return IZ36;
		}

		public void setIZ36(String iZ36) {
			IZ36 = iZ36;
		}

		public String getIZ37() {
			return IZ37;
		}

		public void setIZ37(String iZ37) {
			IZ37 = iZ37;
		}

		public String getIZ38() {
			return IZ38;
		}

		public void setIZ38(String iZ38) {
			IZ38 = iZ38;
		}

		public String getID41() {
			return ID41;
		}

		public void setID41(String iD41) {
			ID41 = iD41;
		}

		public String getID42() {
			return ID42;
		}

		public void setID42(String iD42) {
			ID42 = iD42;
		}

		public String getID43() {
			return ID43;
		}

		public void setID43(String iD43) {
			ID43 = iD43;
		}

		public String getID44() {
			return ID44;
		}

		public void setID44(String iD44) {
			ID44 = iD44;
		}

		public String getID45() {
			return ID45;
		}

		public void setID45(String iD45) {
			ID45 = iD45;
		}

		public String getID46() {
			return ID46;
		}

		public void setID46(String iD46) {
			ID46 = iD46;
		}

		public String getID47() {
			return ID47;
		}

		public void setID47(String iD47) {
			ID47 = iD47;
		}

		public String getID48() {
			return ID48;
		}

		public void setID48(String iD48) {
			ID48 = iD48;
		}

		public paciente getPaciente() {
			return paciente;
		}

		public void setPaciente(paciente paciente) {
			this.paciente = paciente;
		}
		public pacienteOdontograma(Long id, String sD11, String sD12, String sD13, String sD14, String sD15,
				String sD16, String sD17, String sD18, String sI21, String sI22, String sI23, String sI24, String sI25,
				String sI26, String sI27, String sI28, String iZ31, String iZ32, String iZ33, String iZ34, String iZ35,
				String iZ36, String iZ37, String iZ38, String iD41, String iD42, String iD43, String iD44, String iD45,
				String iD46, String iD47, String iD48, com.edgar.valmedent.modelo.paciente paciente) {
			super();
			this.id = id;
			SD11 = sD11;
			SD12 = sD12;
			SD13 = sD13;
			SD14 = sD14;
			SD15 = sD15;
			SD16 = sD16;
			SD17 = sD17;
			SD18 = sD18;
			SI21 = sI21;
			SI22 = sI22;
			SI23 = sI23;
			SI24 = sI24;
			SI25 = sI25;
			SI26 = sI26;
			SI27 = sI27;
			SI28 = sI28;
			IZ31 = iZ31;
			IZ32 = iZ32;
			IZ33 = iZ33;
			IZ34 = iZ34;
			IZ35 = iZ35;
			IZ36 = iZ36;
			IZ37 = iZ37;
			IZ38 = iZ38;
			ID41 = iD41;
			ID42 = iD42;
			ID43 = iD43;
			ID44 = iD44;
			ID45 = iD45;
			ID46 = iD46;
			ID47 = iD47;
			ID48 = iD48;
			this.paciente = paciente;
		}
}
	   
