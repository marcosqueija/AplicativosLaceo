package br.ufrj.coppe.laceo.AppLACEO.dto.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaterialBaseInputDto {

	private String name;
	private String descricao;
	private String tipo;
	private double pesoespecifico;
	private double mod_elast_long;
	private double coef_poisson;
	private double tensaodeescoamento;
	private double tensaoderuptura;

}
