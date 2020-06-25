package br.ufrj.coppe.laceo.AppLACEO.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="cabosamarras")
public class CabosAmarras {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	protected String nome;
	protected String tipo;
	protected String descricao;
	protected double pesosubmerso;
	protected double pesoseco;
	protected double rigidez;
	protected double tracaomaxima;
	protected double diametronominal;
	
}
