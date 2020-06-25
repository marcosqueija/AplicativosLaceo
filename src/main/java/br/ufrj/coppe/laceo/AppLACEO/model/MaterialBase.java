package br.ufrj.coppe.laceo.AppLACEO.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="materialbase")
public class MaterialBase {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String descricao;
	private String Tipo;
	private double pesoespecifico;
	private double mod_elast_long;
	private double coef_poisson;
	private double massaespecifica;
	private double tensaodeescoamento;
	private double tensaoderuptura;

	public void setPesoespecifico(double pesoespecifico) {
		this.pesoespecifico = pesoespecifico;
		this.setMassaespecifica(Math.round(1000*pesoespecifico/9.81)/1000);
	}

	public void setMassaespecifica(double massaespecifica) {
		this.massaespecifica = massaespecifica;
		this.pesoespecifico = (Math.round(1000*massaespecifica*9.81)/1000);
	}

}