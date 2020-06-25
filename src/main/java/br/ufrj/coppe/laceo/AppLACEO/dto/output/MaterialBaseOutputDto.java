package br.ufrj.coppe.laceo.AppLACEO.dto.output;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;

import br.ufrj.coppe.laceo.AppLACEO.model.MaterialBase;
import lombok.Data;

@Data
public class MaterialBaseOutputDto {

	private String ownerName;

	public MaterialBaseOutputDto(MaterialBase materialbase) {
		this.ownerName = materialbase.getName();
	}
	
	public static List<MaterialBaseOutputDto> listFromMateriais(List<MaterialBase> materiaisbase){		
		return materiaisbase.stream()
				.map(MaterialBaseOutputDto::new)
				.collect(Collectors.toList());		       
	}
	
	public static Page<MaterialBaseOutputDto>listFromMateriais(Page<MaterialBase> materiaisbase){
		return materiaisbase.map(MaterialBaseOutputDto::new);		
	}

}
