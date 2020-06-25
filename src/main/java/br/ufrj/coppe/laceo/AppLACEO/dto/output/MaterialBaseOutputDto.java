package br.ufrj.coppe.laceo.AppLACEO.dto.output;


import java.util.List;
import java.util.stream.Collectors;

import br.ufrj.coppe.laceo.AppLACEO.model.MaterialBase;
import lombok.Data;

@Data
public class MaterialBaseOutputDto {

	private String ownerName;

	public MaterialBaseOutputDto(MaterialBase materialbase) {
		this.ownerName = materialbase.getNome();
	}
	
	public static List<MaterialBaseOutputDto> listFromMateriais(List<MaterialBase> materiaisbase){
		
		return materiaisbase.stream()
				.map(MaterialBaseOutputDto::new)
				.collect(Collectors.toList());		       
	}

}
